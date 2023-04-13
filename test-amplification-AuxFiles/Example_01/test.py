# import os
# import pathlib
# from typing import ByteString
# import pandas as pd
# from toyExample import *
# import pytest
# import click


# def saveState(df_main, tID):
#     # name = 'state_v0.csv'
#     # name = 'mutant_in_append_data.csv'
    
#     # name = 'mutant_in_count_occurrences.csv'
#     df_main['testID'] = tID
#     here_iam = str(pathlib.Path().absolute())
#     resultsPath = here_iam + '/' + name
        
#     if not os.path.exists(resultsPath):    
#         with open(name, 'a', newline = '') as f:
#             # df_main = df_main.sort_values(by=['testID'], ascending=True)
#             df_main.to_csv(f, index = False, header = True)
#     else:
#         with open(name, 'a', newline = '') as f:
#             # df_main = df_main.sort_values(by=['testID'], ascending=True)
#             df_main.to_csv(f, index = False, header = False)

# def track_state(input, testID, methodCall):
#     obj = ToyExample(input)
#     # print(obj.get_max())

#     state = {
#         'testID': testID,
#         'input' : str(input),
#         'methodCall': methodCall,
#         'get_max': obj.get_max(),
#         'get_min': obj.get_min(),
#         'check_last': obj.check_last(),
#         'check_first': obj.check_first(),
#         'get_size': obj.get_size(),
#         'is_empty': obj.is_empty(),
#         'is_sorted': obj.is_sorted(),
#         'calculate_sum':obj.calculate_sum(),
#         'get_average': obj.get_average(),

#         }

#     df = pd.DataFrame(state, index=[0])
#     # print(df)
#     saveState(df,testID)

# def test_count_occurrences_after_removing_duplicates():
#     input = [2, 2, 2, 3, 4, 4, 5]
#     toy = ToyExample(input)
#     toy.remove_duplicates()
#     track_state(input, 'test_count_occurrences_after_removing_duplicates' , 'remove_duplicatess')

#     assert toy.count_occurrences(2) == 1
#     assert toy.count_occurrences(3) == 1
#     assert toy.count_occurrences(4) == 1
#     assert toy.count_occurrences(5) == 1

# def test_sum_after_reversing_the_list():
#     input = [1, 2, 3, 4, 5]
#     toy = ToyExample(input)    
#     toy.reverse_data()
#     track_state(input, 'test_sum_after_reversing_the_list' , 'reverse_data')
#     assert toy.calculate_sum() == 15

# def test_max_after_sorting_the_list_in_ascending_order():
#     input = [7, 2, 9, 1, 5]
#     toy = ToyExample(input)
    
#     toy.sort_ascending()
#     track_state(input, 'test_max_after_sorting_the_list_in_ascending_order' , 'sort_ascending')

#     toy.reverse_data()
#     track_state(input, 'test_max_after_sorting_the_list_in_ascending_order' , 'reverse_data')
#     assert toy.get_max() == 9

# def test_is_sorted_after_multiplying_all_elements_by_negative_one():
#     input = [1, 2, 3, 4, 5]
#     toy = ToyExample(input)
#     toy.multiply_by_scalar(-1)
#     track_state(input, 'test_is_sorted_after_multiplying_all_elements_by_negative_one' , 'multiply_by_scalar')

#     assert toy.is_sorted() == False

# def test_get_min_after_appending_a_new_minimum_element():
#     input = [9, 2, 1, 4, 6]
#     toy = ToyExample(input)
#     toy.append_data(1)
#     track_state(input, 'test_get_min_after_appending_a_new_minimum_element' , 'append_data')

#     assert toy.get_min() == 1

# @click.command()
# @click.option('-o', '--out', 'file_out', help='Name of the file in which data will be stored')
# def test(file_out):
#     pytest.main([__file__, '-k', 'test_count_occurrences_after_removing_duplicates', f'--file_out={file_out}'])

# if __name__ == '__main__':
#     test()


# def test_set_data_and_sort_ascending():
#     obj = ToyExample([5, 3, 7, 1, 9])

#     input = [4, 1, 8, 3, 6]
#     obj.set_data(input)
    
#     track_state(input, 'test_set_data_and_sort_ascending' , 'set_data')
#     obj.sort_ascending()
#     track_state(input, 'test_set_data_and_sort_ascending', 'sort_ascending')
#     assert obj.data == [1, 3, 4, 6, 8]


# def test_set_data_and_remove_duplicates():
#     obj = ToyExample([3, 7, 2, 9, 7, 1, 3])

#     input = [4, 1, 8, 3, 6]
#     obj.set_data(input)
#     track_state(input, 'test_set_data_and_sort_ascending' , 'set_data')
#     obj.remove_duplicates()
#     track_state(input, 'test_set_data_and_sort_ascending' , 'set_data')

#     assert obj.data == [4, 1, 8, 3, 6]


# def test_set_data_and_multiply_by_scalar():
#     obj = ToyExample([2, 4, 6, 8])
#     obj.set_data([4, 1, 8, 3, 6])
#     obj.multiply_by_scalar(3)
#     assert obj.data == [12, 3, 24, 9, 18]


# def test_sort_ascending_and_remove_duplicates():
#     obj = ToyExample([5, 3, 7, 1, 9])
#     obj.sort_ascending()
#     obj.remove_duplicates()
#     assert obj.data == [1, 3, 5, 7, 9]


# def test_sort_ascending_and_multiply_by_scalar():
#     obj = ToyExample([7, 1, 3, 5, 9])
#     obj.sort_ascending()
#     obj.multiply_by_scalar(2)
#     assert obj.data == [2, 6, 10, 14, 18]


# def test_remove_duplicates_and_multiply_by_scalar():
#     obj = ToyExample([2, 4, 2, 6, 8])
#     obj.remove_duplicates()
#     obj.multiply_by_scalar(4)
#     assert obj.data == [8, 16, 24, 32]


# def test_set_data_and_get_min():
#     obj = ToyExample([5, 3, 7, 1, 9])
#     obj.set_data([4, 1, 8, 3, 6])
#     min_val = obj.get_min()
#     assert min_val == 1


# def test_set_data_and_check_first():
#     obj = ToyExample([5, 3, 7, 1, 9])
#     obj.set_data([4, 1, 8, 3, 6])
#     first_val = obj.check_first()
#     assert first_val == 4


# def test_sort_ascending_and_is_empty():
#     obj = ToyExample([5, 3, 7, 1, 9])
#     obj.sort_ascending()
#     obj.remove_duplicates()
#     assert obj.is_empty() == False


# def test_remove_duplicates_and_size():
#     obj = ToyExample([2, 4, 2, 6, 8])
#     obj.remove_duplicates()
#     obj.multiply_by_scalar(4)
#     size = obj.get_size()
#     assert size == 4


# def test_sort_remove_multiply_max():
#     obj = ToyExample([4, 1, 8, 3, 6])
#     obj.sort_ascending()
#     obj.remove_duplicates()
#     obj.multiply_by_scalar(3)
#     max_val = obj.get_max()
#     assert max_val == 24

# def test_empty():
#     obj = ToyExample([])
#     obj.sort_ascending()
#     obj.remove_duplicates()
#     obj.multiply_by_scalar(3)
#     max_val = obj.get_max()
#     assert max_val is None

# def test_sort_reverse_check_first():
#     obj = ToyExample([4, 1, 8, 3, 6])
#     obj.sort_ascending()
#     obj.reverse_data()
#     first_val = obj.check_first()
#     assert first_val == 8

# def test_remove_duplicates_size_average():
#     obj = ToyExample([4, 1, 8, 3, 6, 8, 4])
#     obj.remove_duplicates()
#     size = obj.get_size()
#     average = obj.get_average()
#     assert size == 5
#     assert average == 4.4

# def test_append_check_last():
#     obj = ToyExample([4, 1, 8, 3, 6])
#     obj.append_data(9)
#     last_val = obj.check_last()
#     assert obj.data == [4, 1, 8, 3, 6, 9]
#     assert last_val == 9

# def test_multiply_by_scalar_empty():
#     obj = ToyExample([])
#     obj.multiply_by_scalar(3)
#     max_val = obj.get_max()
#     assert max_val is None

# def test_check_max_min():
#     obj = ToyExample([4, 1, 8, 3, 6])
#     max_val = obj.get_max()
#     min_val = obj.get_min()
#     assert max_val == 8
#     assert min_val == 1

# def test_set_data_is_empty():
#     obj = ToyExample([4, 1, 8, 3, 6])
#     obj.set_data([])
#     is_empty = obj.is_empty()
#     assert obj.data == []
#     assert is_empty is True

# def test_set_data_check_first():
#     obj = ToyExample([4, 1, 8, 3, 6])
#     obj.set_data([9, 2, 7])
#     first_val = obj.check_first()
#     assert obj.data == [9, 2, 7]
#     assert first_val == 9 

# def test_sort_reverse_remove_duplicates():
#     obj = ToyExample([4, 1, 8, 3, 6, 8, 4])
#     obj.sort_ascending()
#     obj.reverse_data()
#     obj.remove_duplicates()
#     assert obj.data == [1, 3, 4, 6, 8]

import os
import pathlib
from pydoc import cli
from typing import ByteString
import pandas as pd
from toyExample import *
import pytest
import click

global name 
name = ' test'

def saveState(df_main, tID, name):
    df_main['testID'] = tID
    here_iam = str(pathlib.Path().absolute())
    resultsPath = here_iam + '/' + name
        
    if not os.path.exists(resultsPath):    
        with open(name, 'a', newline = '') as f:
            df_main.to_csv(f, index = False, header = True)
    else:
        with open(name, 'a', newline = '') as f:
            df_main.to_csv(f, index = False, header = False)

def track_state(input, testID, methodCall, name):
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
    saveState(df, testID, name)

def test_count_occurrences_after_removing_duplicates():
    input = [2, 2, 2, 3, 4, 4, 5]
    toy = ToyExample(input)
    toy.remove_duplicates()
    track_state(input, 'test_count_occurrences_after_removing_duplicates', 'remove_duplicates', name)

    assert toy.count_occurrences(2) == 1
    assert toy.count_occurrences(3) == 1
    assert toy.count_occurrences(4) == 1
    assert toy.count_occurrences(5) == 1
    
    return True

# @click.command()
# @click.option('-o', '--out', 'file_out', help='Name of the file in which data will be stored')
# def test(file_out):
#     global name 
#     name = file_out
     
# if __name__ == '__main__':
#     # cli()
#     pytest.main()