Mutatest diagnostic summary
===========================
 - Source location: /Users/alduck/Documents/PhDStuff_repo/mutationAnali/example
 - Test commands: ['pytest']
 - Mode: f
 - Excluded files: []
 - N locations input: 10
 - Random seed: 345

Random sample details
---------------------
 - Total locations mutated: 2
 - Total locations identified: 2
 - Location sample coverage: 100.00 %


Running time details
--------------------
 - Clean trial 1 run time: 0:00:00.557884
 - Clean trial 2 run time: 0:00:00.440076
 - Mutation trials total run time: 0:00:07.175293

Overall mutation trial summary
==============================
 - DETECTED: 12
 - TOTAL RUNS: 12
 - RUN DATETIME: 2022-11-17 16:33:01.763206


Mutations by result status
==========================


DETECTED
--------
 - example/toy_example.py: (l: 8, c: 13) - mutation from <class 'ast.Add'> to <class 'ast.Pow'>
 - example/toy_example.py: (l: 8, c: 13) - mutation from <class 'ast.Add'> to <class 'ast.Mult'>
 - example/toy_example.py: (l: 8, c: 13) - mutation from <class 'ast.Add'> to <class 'ast.FloorDiv'>
 - example/toy_example.py: (l: 8, c: 13) - mutation from <class 'ast.Add'> to <class 'ast.Mod'>
 - example/toy_example.py: (l: 8, c: 13) - mutation from <class 'ast.Add'> to <class 'ast.Sub'>
 - example/toy_example.py: (l: 8, c: 13) - mutation from <class 'ast.Add'> to <class 'ast.Div'>
 - example/toy_example.py: (l: 11, c: 13) - mutation from <class 'ast.Sub'> to <class 'ast.Pow'>
 - example/toy_example.py: (l: 11, c: 13) - mutation from <class 'ast.Sub'> to <class 'ast.Add'>
 - example/toy_example.py: (l: 11, c: 13) - mutation from <class 'ast.Sub'> to <class 'ast.Mod'>
 - example/toy_example.py: (l: 11, c: 13) - mutation from <class 'ast.Sub'> to <class 'ast.FloorDiv'>
 - example/toy_example.py: (l: 11, c: 13) - mutation from <class 'ast.Sub'> to <class 'ast.Div'>
 - example/toy_example.py: (l: 11, c: 13) - mutation from <class 'ast.Sub'> to <class 'ast.Mult'>