'''
A few unit tests for ExampleClass.

@author: Csaba Sulyok
'''

import unittest
from example import ExampleClass


class TestExampleClass(unittest.TestCase):
    '''
    Genetic string breeder unit tests.
    '''

    def setUp(self):
        self.example = ExampleClass()
    
    
    def testWhatsTheWord(self):
        theWord = self.example.whatsTheWord()
        self.assertEqual("bird", theWord)
    
    
    def testIsTheWord_Correct(self):
        result = self.example.isTheWord("bird");
        self.assertTrue(result)
    
    
    def testIsTheWord_CorrectCasesAndTrim(self):
        result = self.example.isTheWord("  BIrD  ")
        self.assertTrue(result)
    
    
    def testIsTheWord_Incorrect(self):
        result = self.example.isTheWord("not the bird");
        self.assertFalse(result)



if __name__ == "__main__":
    unittest.main()