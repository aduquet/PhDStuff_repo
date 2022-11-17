from toy_example import calculator
from unittest import TestCase

# import pandas as pd
class AddSubTest(TestCase):
    # def test_add_MR1(self):

    #     inputs = pd.read_csv('log_1000.csv', index_col= 0)
    #     print(calculator(2,4).add())
    #     self.assertEqual(calculator(2,2).add(),4)

    # MR1 TRANSFORMATION (Permutation of the input)
    # MR2 TRANSFORMATION (Multiply by a positive constant )
    # MR3 TRANSFORMATION (Adding a positive constant to each operand )


    global a, b, constant
    a = [0,2,3,20]
    b = [1,2,9,1]
    constant = 4

    # def test_bad(self):
    #     self.assertEqual(calculator(2,2).add(), 4)

    def test_sub_MR1(self):

        for i in range(0,len(a)):
            if a[i] == b[i] == 0 or b[i] == a[i]:
                expected = calculator(b[i],a[i]).subtraction()
                self.assertEqual(calculator(a[i],b[i]).subtraction(), expected)
            
            else:
                expected = calculator(b[i],a[i]).subtraction()
                self.assertNotEqual(calculator(a[i],b[i]).subtraction(), expected)

    def test_add_MR2(self):
        # Output must to be <

        for i in range(0,len(a)):

            # Violation case
            if a[i] == 0 and b[i] == 0 :
                self.assertEqual(calculator(a[i],b[i]).add(), 0)

            #No-violation case
            else:
                expected = calculator(constant * a[i], constant * b[i]).add()
                self.assertLess(calculator(a[i],b[i]).add(), expected)

    def test_sub_MR2(self):
        # Must to be <

        for i in range(0,len(a)):

            #No-Violation case
            if a[i] > b[i] or b[i] == 0 and a[i] != 0 :
                expected = calculator(constant * a[i], constant * b[i]).subtraction()
                self.assertLess(calculator(a[i],b[i]).subtraction(), expected)

            elif a[i] == 0 and b[i] == 0 or a[i]==b[i]:
                self.assertEqual(calculator(a[i],b[i]).subtraction(), 0)

            #violation case
            else:
                expected = calculator(constant * a[i], constant * b[i]).subtraction()
                self.assertGreater(calculator(a[i],b[i]).subtraction(), expected)

    def test_sub_MR3(self):

        for i in range(0,len(a)):
            expected = calculator( a[i] + constant, b[i] + constant).subtraction()
            self.assertEqual(calculator(a[i],b[i]).subtraction(), expected)
            
    def test_sub_MR4(self):

        for i in range(0,len(a)):
            expected = calculator( a[i] - constant, b[i] - constant).subtraction()
            self.assertEqual(calculator(a[i],b[i]).subtraction(), expected)
    

