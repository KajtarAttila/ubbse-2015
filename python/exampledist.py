'''
Create example distributable EXE.
Needs py2exe.
For Python 2, use: pip install http://sourceforge.net/projects/py2exe/files/latest/download?source=files

@author Csaba Sulyok
'''

from distutils.core import setup
from example import buildLogger

# ALWAYS import numpy here, otherwise py2exe will fail!
import numpy
import py2exe
from nt import getcwd


if __name__ == '__main__':
    logger = buildLogger('example-dist')
    
    startScript = '%s/example.py' %(getcwd())
    distDir = '%s/dist' %(getcwd())
    
    options = {
        'py2exe': {
            'dist_dir': distDir
        }
    }
    
    logger.info('Start script: %s' %startScript)
    logger.info('Distributable directory: %s' %distDir)
    
    setup(name = 'ubb-se-example',
          console = [{'script' : startScript,
                      'ubb-se-example' : 'emc'}],
          options = options)