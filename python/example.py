'''
Example class to demonstrate automatic testing and Jenkins reports
using Python.

@author Csaba Sulyok
'''

import logging
import sys


class ExampleClass(object):
    
     theWord = 'bird'
    
    def whatsTheWord(self):
        return self.theWord
    
    def isTheWord(self, referenceWord):
        return referenceWord.strip().lower() == self.theWord



'''
Build console logger.
'''
def buildLogger(name = 'example'):
    logger = logging.getLogger(name)
    logger.setLevel(logging.INFO)
    
    consoleLogger = logging.StreamHandler(stream=sys.stdout)
    consoleLogger.setFormatter(logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s'))
    logger.addHandler(consoleLogger)
    return logger



'''
Main entry point of distributable.
'''
if __name__ == '__main__':
    logger = buildLogger()
    logger.warn('Entry point')
    
    example = ExampleClass()
    logger.info("The %s is the word!" %(example.whatsTheWord()))