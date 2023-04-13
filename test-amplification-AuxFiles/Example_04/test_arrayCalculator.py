from os import PathLike
import os
import unittest
import argparse
from array_calculator import ArrayCalculator
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
        obj = ArrayCalculator(input)
        if methodCall == 'CTOR':
            state = {
            'testID': testID,
            'input' : str(input),
            'methodCall': methodCall,
            # 'get_max': obj.get_max(),
            # 'get_min': obj.get_min(),
            'get_last_element': '-',
            'get_first_element': '-',
            'get_size': '-',
            'is_empty': '-',
            'get_sum': '-',
            'get_average': '-',
            }

        else:
            state = {
                'testID': testID,
                'input' : str(input),
                'methodCall': methodCall,
                # 'get_max': obj.get_max(),
                # 'get_min': obj.get_min(),
                'get_last_element': obj.get_last_element(),
                'get_first_element': obj.get_first_element(),
                'get_size': obj.get_size(),
                'is_empty': obj.is_empty(),
                'get_sum': obj.get_sum(),
                'get_average': obj.get_average(),
            }
        df = pd.DataFrame(state, index=[0])
        self.saveState(df, testID, name)

    def setUp(self):
        self.array = ArrayCalculator([2, 3, 1, 4, 5])
    
    def test_get_sum(self):
        # Test with one call to get_sum
        self.track_state(input = self.array.data,testID='test_get_sum',methodCall='CTOR', name=name)
        self.assertEqual(self.array.get_sum(), 15)
        self.track_state(input = self.array.data,testID='test_get_sum',methodCall='get_sum', name=name)

        # Test with additional method calls
        self.array.reverse_data()
        self.track_state(input = self.array.data,testID='test_get_sum',methodCall='reverse_data', name=name)

        self.array.append_data([6, 7, 8])
        self.track_state(input = self.array.data,testID='test_get_sum',methodCall='append_data', name=name)
        self.array.append_data([9, 10])
        self.track_state(input = self.array.data,testID='test_get_sum',methodCall='append_data', name=name)
        self.assertEqual(self.array.get_sum(), 55)
        self.track_state(input = self.array.data,testID='test_get_sum',methodCall='get_sum', name=name)

    
    def test_get_average(self):
        # Test with one call to get_average
        self.track_state(input = self.array.data,testID='test_get_average',methodCall='CTOR', name=name)
        self.assertEqual(self.array.get_average(), 3.0)
        self.track_state(input = self.array.data,testID='test_get_average',methodCall='get_average', name=name)


        
        # Test with additional method calls
        self.array.reverse_data()
        self.track_state(input = self.array.data,testID='test_get_average',methodCall='reverse_data', name=name)

        self.array.append_data([6, 7, 8])
        self.track_state(input = self.array.data,testID='test_get_average',methodCall='append_data', name=name)

        self.array.reverse_data()
        self.track_state(input = self.array.data,testID='test_get_average',methodCall='reverse_data', name=name)

        self.assertEqual(self.array.get_average(), 4.5)
        self.track_state(input = self.array.data,testID='test_get_average',methodCall='get_average', name=name)

        

    def test_average_empty(self):
        # Test with an empty array

        self.track_state(input = self.array.data,testID='test_average_empty',methodCall='CTOR', name=name)
        # self.array.clear_data()
        self.array = ArrayCalculator([])

        self.track_state(input = self.array.data,testID='test_average_empty',methodCall='clear_data', name=name)
        self.track_state(input = self.array.data,testID='test_get_average',methodCall='get_average', name=name)
        self.assertEqual(self.array.get_average(), None)
        self.track_state(input = self.array.data,testID='test_get_average',methodCall='get_average', name=name)

        

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
