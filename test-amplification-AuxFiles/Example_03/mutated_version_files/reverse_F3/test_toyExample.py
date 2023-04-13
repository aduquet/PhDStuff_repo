from os import PathLike
import os
import unittest
import argparse
from toyExample import ToyExample
import pandas as pd

class TestToyExample(unittest.TestCase):

    @staticmethod
    def saveState(df_main, tID, name):
        df_main['testID'] = tID
        # here_iam = str(PathLike.Path().absolute())
        here_iam = os.getcwd()
        resultsPath = os.path.join(here_iam, name + '.csv')
            
        if not os.path.exists(resultsPath):    

            with open(resultsPath, 'a', newline = '') as f:
                df_main.to_csv(f, index = False, header = True)

        else:
            with open(resultsPath, 'a', newline = '') as f:
                df_main.to_csv(f, index = False, header = False)


    def track_state(self, input, testID, methodCall, name):
        obj = ToyExample(input)
        state = {
            'testID': testID,
            'input' : str(input),
            'methodCall': methodCall,
            'get_max': obj.get_max(),
            'get_min': obj.get_min(),
            'check_last': obj.check_last(),
            'check_first': obj.check_first(),
            'get_size': obj.get_size(),
            'is_empty': obj.is_empty(),
            'is_sorted': obj.is_sorted(),
            'calculate_sum':obj.calculate_sum(),
            'get_average': obj.get_average(),
        }
        df = pd.DataFrame(state, index=[0])
        self.saveState(df, testID, name)
        
    def test_set_data(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        toy_example.set_data([4, 5, 6])
        self.track_state(toy_example.data ,testID='test_set_data',methodCall='set_data', name=name)
        self.assertEqual(toy_example.data, [4, 5, 6])
    
    def test_reverse_data(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        toy_example.reverse_data()
        self.track_state(toy_example.data,testID='test_reverse_data',methodCall='reverse_data', name=name)

        self.assertEqual(toy_example.data, [3, 2, 1])
    
    def test_sort_ascending(self):
        input = [3,2,1]
        toy_example = ToyExample(input)
        toy_example.sort_ascending()

        self.track_state(toy_example.data,testID='test_sort_ascending',methodCall='sort_ascending', name=name)
        self.assertEqual(toy_example.data, [1, 2, 3])
    
    def test_remove_duplicates(self):
        input = [1, 2, 2, 3]
        toy_example = ToyExample(input)
        toy_example.remove_duplicates()

        self.track_state(toy_example.data ,testID='test_remove_duplicates',methodCall='remove_duplicates', name=name)
        self.assertEqual(toy_example.data, [1, 2, 3])
    
    def test_append_data(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        toy_example.append_data(4)

        self.track_state(toy_example.data,testID='test_append_data',methodCall='append_data', name=name)
        self.assertEqual(toy_example.data, [1, 2, 3, 4])
    
    def test_multiply_by_scalar(self):
        input = [1,2,3]
        toy_example = ToyExample(input)
        toy_example.multiply_by_scalar(2)

        self.track_state(toy_example.data,testID='test_multiply_by_scalar',methodCall='multiply_by_scalar', name=name)
        self.assertEqual(toy_example.data, [2, 4, 6])
    
    def test_get_max(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        self.track_state(input = input ,testID='test_get_max',methodCall='get_max', name=name)

        self.assertEqual(toy_example.get_max(), 3)
    
    def test_get_min(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        self.track_state(toy_example.data ,testID='test_get_min',methodCall='get_min', name=name)
        self.assertEqual(toy_example.get_min(), 1)
    
    def test_check_last(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        self.track_state(toy_example.data ,testID='test_check_last',methodCall='check_last', name=name)
        self.assertEqual(toy_example.check_last(), 3)
    
    def test_check_first(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        self.track_state(toy_example.data ,testID='test_check_first',methodCall='check_first', name=name)
        self.assertEqual(toy_example.check_first(), 1)
    
    def test_get_size(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        self.track_state(toy_example.data ,testID='test_get_size',methodCall='get_size', name=name)
        self.assertEqual(toy_example.get_size(), 3)
    
    def test_is_empty(self):
        input = []
        toy_example = ToyExample(input)
        self.track_state(toy_example.data ,testID='test_is_empty',methodCall='is_empty', name=name)
        self.assertEqual(toy_example.is_empty(), True)
    
    def test_is_sorted(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        self.track_state(toy_example.data ,testID='test_is_sorted',methodCall='is_sorted', name=name)

        self.assertEqual(toy_example.is_sorted(), True)
    
    def test_calculate_sum(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        self.track_state(toy_example.data ,testID='test_calculate_sum',methodCall='calculate_sum', name=name)

        self.assertEqual(toy_example.calculate_sum(), 6)
    
    def test_get_average(self):
        input = [1, 2, 3]
        toy_example = ToyExample(input)
        self.track_state(toy_example.data ,testID='test_get_average',methodCall='get_average', name=name)

        self.assertEqual(toy_example.get_average(), 2)


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
