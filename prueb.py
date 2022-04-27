import collections
import ast
import os

def analyze(packagedir):
    stats = collections.defaultdict(int)
    # for (dirpath, dirnames, filenames) in os.walk(packagedir):
    #     for filename in filenames:
            
    #         if filename == 'example.py':
    #             filename = os.path.join(dirpath, filename)
    #             print('*********')
    #             syntax_tree = ast.parse(open(filename).read(), filename)
    #             for node in ast.walk(syntax_tree):
    #                 stats[type(node)] += 1  
    #             # continue
    path = r"C:/Users/duquet/Documents/GitHub/PhDStuff/example1.py"
    with open(path) as f:
        src = f.read()
    stats = collections.defaultdict(int)
    tree=ast.parse(src)
    for node in ast.walk(tree):
        print(node)
        stats[type(node)] += 1
             

    return stats

print("Number of def statements:", analyze('.')[ast.FunctionDef])
print("Number of class statements:", analyze('.')[ast.ClassDef])