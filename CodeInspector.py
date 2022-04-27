import os
import re
import sys
import lizard
import string
import fileinput

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
        
           
    