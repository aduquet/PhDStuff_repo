from os import PathLike
import os
import unittest
import argparse
from toyExample import ToyExample
import pandas as pd

class TestToyExample(unittest.TestCase):

    def setUp(self):
        # Set up the ToyExample instance with some initial data
        self.toy_example = ToyExample([2, 4, 1, 3, 5])
        
        # Modify the ToyExample instance by appending new elements, multiplying by a scalar, and reversing the data
        self.toy_example.append_data(6)
        self.toy_example.multiply_by_scalar(2)
        self.toy_example.reverse_data()
        self.toy_example.append_data(7)

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
        

    def test_calculate_sum(self):
        # Test if the sum of the data is calculated correctly
        self.assertEqual(self.toy_example.calculate_sum(), 56)
    
    def test_get_average(self):
        # Test if the average of the data is calculated correctly
        self.assertAlmostEqual(self.toy_example.get_average(), 5.6)
    
    def test_get_max(self):
        # Test if the maximum value of the data is returned correctly
        self.assertEqual(self.toy_example.get_max(), 14)
    
    def test_get_min(self):
        # Test if the minimum value of the data is returned correctly
        self.assertEqual(self.toy_example.get_min(), 2)
