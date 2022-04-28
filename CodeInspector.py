import os
import re
import sys
from typing import Any, Optional, Callable, List, Type, Set, Tuple
import lizard
import string
import fileinput
    
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
    
    def avg_method_coverage(self, func_used):
        total_num_methods = self.method_name()
        return round(len(func_used)/len(total_num_methods), 5)
    
