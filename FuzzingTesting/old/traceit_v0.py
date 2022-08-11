from types import FrameType, TracebackType
from typing import Any, Callable, Optional

import sys

def traceit(frame: FrameType, event: str, arg: Any) -> Optional[Callable]:

    if event == 'line':
        global coverage
        function_name = frame.f_code.co_name
        lineno = frame.f_lineno
        coverage.append(lineno)
        print(function_name)

    return traceit

