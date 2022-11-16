import sys
import zlib
import atheris

with atheris.instrument_imports():
    from toy_example import calculator 

	
@atheris.instrument_func
def TestOneInput(data): 
    
    fdp = atheris.FuzzedDataProvider(data)
    input = fdp.ConsumeIntList(2,1)
    print('start')
    print('Inputs: ', input )
    print(calculator(input[0], input[1]))
    print('end')
    print('*********')
    # print('a: ', a)
    # print('b: ', b)
	# try:
		# print(calculator(a,b).subtraction())
	
	# except zlib.error:
  		# pass

atheris.Setup(sys.argv,TestOneInput)
atheris.Fuzz()