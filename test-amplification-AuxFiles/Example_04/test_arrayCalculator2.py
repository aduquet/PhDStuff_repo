from os import PathLike
import os
import unittest
import argparse
from array_calculator import ArrayCalculator
import pandas as pd

class TestToyExample(unittest.TestCase):

    def test_get_sum(self):
        self.array = ArrayCalculator([2, 3, 1, 4, 5])
        self.assertEqual(self.array.get_sum(), 15)
        self.array.reverse_data()
        self.array.append_data([6, 7, 8])
        self.array.append_data([9, 10])
        self.assertEqual(self.array.get_sum(), 55)

    def test_get_average(self):
        self.array = ArrayCalculator([2, 3, 1, 4, 5])
        self.assertEqual(self.array.get_average(), 3.0)
        self.array.reverse_data()
        self.array.append_data([6, 7, 8])
        self.array.reverse_data()
        self.assertEqual(self.array.get_average(), 4.5)


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('-o', '--out', dest='file_out', help='Name of the file in which data will be stored')
    args, unknown = parser.parse_known_args()
    
    global name 


    if args.file_out:
        name = (args.file_out).split('.')[0]

        with open(args.file_out, 'w') as f:
            runner = unittest.TextTestRunner(stream=f, verbosity=2)
            unittest.main(argv=[__file__], testRunner=runner, exit=False)
    else:
        unittest.main(verbosity=2, argv=[__file__])
