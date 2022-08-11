from typing import List
import random

#A string of up to `max_length` characters'''
#in the range [`char_start`, `char_start` + `char_range`)'''

def fuzzer(max_length: int = 100, char_start: int = 32, char_range: int = 32) -> str:

    string_length = random.randrange(0, max_length + 1)
    out = ""
    for i in range(0, string_length):
        out += chr(random.randrange(char_start, char_start + char_range))
    return out

def hundred_inputs(trials) -> List[str]:
    population = []
    for i in range(trials):
        population.append(fuzzer())
    return population