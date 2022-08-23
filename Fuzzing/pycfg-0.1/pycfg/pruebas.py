import sys
import inspect
import re
from expample import *

Control_Flow = ['if', 'elif', 'while', 'for']
Control_Flow_Re = [re.compile(r'^ *%s +(.+) *: *' % i) for i in Control_Flow]

def traceit(frame, event, arg):
    if event in ['call', 'return', 'line']:
        fname, line = frame.f_code.co_filename, frame.f_lineno
        myvars = {**frame.f_globals, **frame.f_locals} # should we do deep copy?
        finfo = inspect.getframeinfo(frame)
        src = finfo.code_context[finfo.index]
        matches = (ctrl.match(src) for ctrl in Control_Flow_Re)
        conditional = next((m.group(1) for m in matches if m), None)

        traceit.cov_arcs.append((traceit.pfname, fname, traceit.prevline, line, conditional, myvars))
        traceit.prevline = line
        traceit.pfname = fname
    else: pass # 'exception'
    return traceit

ex()
traceit.cov_arcs = []
traceit.prevline = 0
traceit.pfname = None
oldtrace = sys.gettrace()
print(oldtrace)
sys.settrace(traceit)