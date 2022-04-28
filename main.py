import os
import pathlib
import glob as gl
import numpy as np
import pandas as pd
from CodeInspector import CodeInspector

from example1 import Prints
# from CodeInspector import *
from alejaCovSyst import *

def readSUT(sut):
    try:
        if CodeInspector(sut).is_non_empty_file():
            content = CodeInspector(sut).read_file()
            print('nloc:', CodeInspector(sut).nloc())
            print('start_line:', CodeInspector(sut).start_line())
            print('end_line:', CodeInspector(sut).end_line())
            print('method_name:', CodeInspector(sut).method_name())
            # print(EyeRa(sut).avg_statement_coverage())
            # print('content', content)
            return content
        else:
            raise ValueError('Empty file!')
    except OSError:
        raise ValueError('The file ' '"', sut, '" does not exist!')

def run_alejaCovSystem(sut):
    
    try:
        with EyeRa() as cov:
            Prints(3,3)
            # Prints(3,2)
    except:
            pass
    print('*** Statement coverage ***')
    covw = cov.coverage()
    print( cov.coverage())
    print('trace', cov.trace())
    print('trace_return', cov.trace_return_values())
    print('***** Avg statement****:', CodeInspector(sut).avg_statement_coverage(covw))
    
    
if __name__ == '__main__':
    import click

    @click.command()
    @click.option('--sut', 'input_file', default = 'Prints()',help = 'path of the System Under Test')
    @click.option('--sc', 'stamentCov', default = 0.8, help= 'Statement Coverage, default value 0.8 ')
    @click.option('--bc', 'branchCov', default = 0.8, help= 'Branch Coverage, default value 0.8 ')
    @click.option('--o', 'output_file', default = 'results',help = 'Report file Name')

    def main(input_file, stamentCov, branchCov, output_file):

        global df_main
        
        here_iam = str(pathlib.Path().absolute())
        resultsPath = here_iam + '\\' + output_file

        if not os.path.exists(resultsPath):
            os.mkdir(resultsPath)
        
        # print(readSUT(sut='example1.py'))

        run_alejaCovSystem(sut='example1.py')

main()