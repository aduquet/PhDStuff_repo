
from traceit import *
from cgi_decoder import cgi_decode


if __name__ == '__main__':
    with Coverage() as cov:
        cgi_decode("a+b")
    print('*** cov.coverage ***')
    print(cov.function_names())
    print(cov.coverage())
    
if __name__ == '__main__':
    print('*** cov ***')
    print(cov)
    
if __name__ == '__main__':
    print('\n## Comparing Coverage')



if __name__ == '__main__':
    with Coverage() as cov_plus:
        cgi_decode("a+b")
    with Coverage() as cov_standard:
        cgi_decode("abc")
    cov_plus.coverage() - cov_standard.coverage()
    
    
    
if __name__ == '__main__':
    with Coverage() as cov_max:
        cgi_decode('+')
        cgi_decode('%20')
        cgi_decode('abc')
        try:
            cgi_decode('%?a')
        except Exception:
            pass

if __name__ == '__main__':
    print('**')
    print(cov_max.coverage() - cov_plus.coverage())