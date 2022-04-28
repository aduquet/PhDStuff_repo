from typing import Any, Optional, Callable, List, Type, Set, Tuple
from types import FrameType, TracebackType

import inspect
import lizard
import sys
import os

Location = Tuple[str, int]

class EyeRa():
    
    def __init__(self) -> None:
        self._trace: List[Location] = []
        self._traceReturn: List[Location] = []
        
    def traceit(self, frame: FrameType, event: str, arg: Any) -> Optional[Callable]:
        """Tracing function. To be overloaded in subclasses."""   
        # co = frame.f_code
        # func_name = co.co_name
        # line_no = frame.f_lineno
        # filename = co.co_filename

        if self.original_trace_function is not None:
            self.original_trace_function(frame, event, arg)

        if event == "line" or event == 'call' or event == 'return':
            
            function_name = frame.f_code.co_name
            lineno = frame.f_lineno
            
            if function_name != '__exit__':  # avoid tracing ourselves:
                self._trace.append((function_name, lineno))
            
            if event == 'return':
                print(event)
                self._traceReturn.append((function_name, lineno, arg, type(arg)))

        # if event == 'call':
        #     print ('Call to %s on line %s of %s' % (func_name, line_no, filename))
              
        # elif event == 'return':
        #         print('%s => %s' % (frame.f_code.co_name, arg))
        #         print('**Return Type**', type(arg))


        return self.traceit

    def __enter__(self) -> Any:
        """Start of `with` block. Turn on tracing."""
        self.original_trace_function = sys.gettrace()
        sys.settrace(self.traceit)
        return self

    def __exit__(self, exc_type: Type, exc_value: BaseException, 
                 tb: TracebackType) -> Optional[bool]:
        """End of `with` block. Turn off tracing."""
        sys.settrace(self.original_trace_function)
        return None  # default: pass all exceptions

    def trace(self) -> List[Location]:
        """The list of executed lines, as (function_name, line_number) pairs"""
        return self._trace
    
    def trace_return_values(self)-> List[Location]:
        """The list of executed lines, as (function_name, lineno, arg, type(arg))"""
        return self._traceReturn

    def coverage(self) -> Set[Location]:
        """The set of executed lines, as (function_name, line_number) pairs"""
        return set(self.trace())
    
    def function_names(self) -> Set[str]:
        """The set of function names seen"""
        return set(function_name for (function_name, line_number) in self.coverage())

    def __repr__(self) -> str:
        """Return a string representation of this object.
           Show covered (and uncovered) program code"""
        t = ""
        for function_name in self.function_names():
            # Similar code as in the example above
            try:
                fun = eval(function_name)
            except Exception as exc:
                t += f"Skipping {function_name}: {exc}"
                continue

            source_lines, start_line_number = inspect.getsourcelines(fun)
            # print(source_lines, start_line_number)
            for lineno in range(start_line_number, start_line_number + len(source_lines)):
                if (function_name, lineno) in self.trace():
                    t += "# "
                else:
                    t += "  "
                t += "%2d  " % lineno
                t += source_lines[lineno - start_line_number]

        return t
