from typing import Any, Optional, Callable, List, Type, Set, Tuple
from types import FrameType, TracebackType

import inspect
import lizard
import sys
import os

Location = Tuple[str, int]

class EyeRa(object):
    
    def __init__(self, filePath) -> None:   
        self._trace: List[Location] = [] 
        self.filePath = filePath
        
    def traceit(self, frame: FrameType, event: str, arg: Any) -> Optional[Callable]:
        """Tracing function. To be overloaded in subclasses."""
        co = frame.f_code
        func_name = co.co_name

        if self.original_trace_function is not None:
            self.original_trace_function(frame, event, arg)

        if event == "line" or event == 'call':
            
            function_name = frame.f_code.co_name
            lineno = frame.f_lineno
            
            if function_name != '__exit__':  # avoid tracing ourselves:
                self._trace.append((function_name, lineno))
                
        elif event == 'return':
                print ('%s => %s' % (func_name, arg))
                print('**Return Type**', type(arg))

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
            for lineno in range(start_line_number, start_line_number + len(source_lines)):
                if (function_name, lineno) in self.trace():
                    t += "# "
                else:
                    t += "  "
                t += "%2d  " % lineno
                t += source_lines[lineno - start_line_number]
        return t
    
class keyWords():
    loops = ['for ', 'while ', 'do ', 'if']
    op = ['and', 'or', 'xor']
    aritmeticOperator = ['+', '-', '*', '/', '%', 'sqrt', '^', 'pow', 'abs', 'log']
    specialOperands = ['++', '--', '**']
    comparativeOperator = ['<', '>', '<=', '>=', '==', '!=', '&&', '||', '!', '&', '|', '<<', '>>', '~', '^' ]
    comments = ['/*', '//', '*/', '/**', '*/' ]
    dataType = ['byte ', 'short ', 'int ', 'long ', 'double ', 'char ', 'boolean ', 'Integer ', 'float ', 'Byte ', 'Short ', 'Long ', 'Double ', 'Char ', 'Boolean ',]

class CodeInspector(object):
    
    def __init__(self, filePath):
        self.filePath = filePath
        self.srcData = self.open_file()
    
    def open_file(self):
        return open(self.filePath, 'r')

    def is_non_empty_file(self): 
        return os.path.isfile(self.filePath) and os.path.getsize(self.filePath) > 0 
    
    def read_file(self):
        return self.srcData.read()
    
    def is_else_statement(self):

        for i in self.srcData:
            statement = i.replace(' ','')
            if statement.find('\n') != -1:
                statement = statement.replace('\n', '')
            
            if statement.find('else:') != -1:
                if len(statement) == 5:
                    return True
                else:
                    return False
                #     print('s')

    def else_counter(self):
        elseCounter = 0
        for i in self.srcData:
            statement = i.replace(' ','')
            if statement.find('else:') != -1:
                
                elseCounter += 1
        
        return elseCounter
    
    def nloc(self):
        code = lizard.analyze_file(self.filePath)
        nlocT = 0
        if(len(code.function_list) != 1):
            for i in range(0, len(code.function_list)):
                nlocT += code.function_list[i].__dict__['nloc']
            return nlocT 
        else:
            return code.function_list[0].__dict__['nloc']
    
    def start_line(self):
        code = lizard.analyze_file(self.filePath)
        if(len(code.function_list) != 1):
            start_lines = []
            for i in range(0, len(code.function_list)):
                start_lines.append(code.function_list[i].__dict__['start_line'])
            return start_lines
        else:
            return code.function_list[0].__dict__['start_line']
    
    def end_line(self):
        code = lizard.analyze_file(self.filePath)
        if(len(code.function_list) != 1):
            end_lines = []
            for i in range(0, len(code.function_list)):
                end_lines.append(code.function_list[i].__dict__['end_line'])
            return end_lines
        else:
            return code.function_list[0].__dict__['end_line']
        
    def method_name(self):
        code = lizard.analyze_file(self.filePath)
        
        if(len(code.function_list) != 1):
            method_names = []
            for i in range(0, len(code.function_list)):
                method_names.append(code.function_list[i].__dict__['name'])
            return method_names
        else:
            return code.function_list[0].__dict__['name']
    
    def avg_statement_coverage(self, cov) -> List[float]:
        
        elseCounter = self.else_counter()
        tloc = self.nloc()
        isElse = self.is_else_statement()
        tloc = tloc - elseCounter
        if(isElse):
            avg_stm = round(len(cov)/tloc, 5)
            return avg_stm
        
        else:
            # print('sdasdasa')
            avg_stm = round(len(cov)/tloc, 5)
            # print('==========',len(cov), tloc)
            return avg_stm
