from toy_example import calculator
from unittest import TestCase

class AddSubTest(TestCase):
    global a, b, constant
    a = [0,2,3,2,0]
    b = [1,2,9,1,2]
    constant = 9
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
                expected = calculator(constant * a[i], constant * b[i]).add()
                self.assertEqual(calculator(a[i],b[i]).add(), expected)

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
                self.assertEqual(constant * a[i], constant * b[i])

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
    

