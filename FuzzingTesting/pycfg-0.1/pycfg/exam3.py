from py2cfg import CFGBuilder

cfg = CFGBuilder().build_from_file('example', 'C:/Users/duquet/Desktop/pycfg-0.1/pycfg-0.1/pycfg/expample.py')
print(cfg)
cfg.build_visual('exampleCFG', 'pdf')