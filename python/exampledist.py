'''
Create example distributable EXE.
Needs py2exe.
For Python 2, use: pip install http://sourceforge.net/projects/py2exe/files/latest/download?source=files

@author Csaba Sulyok
'''

from distutils.core import setup
from example import buildLogger
from os import getcwd, walk, chdir
from os.path import join
from zipfile import ZipFile

# ALWAYS import numpy here, otherwise py2exe will fail!
import numpy
import py2exe


if __name__ == '__main__':
    logger = buildLogger('example-dist')
    
    startScript = '%s/example.py' %(getcwd())
    distDir = '%s/dist' %(getcwd())
    distZipFile = '%s/ubb-se-example-python.zip' %(getcwd())
    
    options = {
        'py2exe': {
            'dist_dir': distDir
        }
    }
    
    logger.info('Start script: %s' %startScript)
    logger.info('Distributable directory: %s' %distDir)
    
    
    # this will create the distributable in the dist folder
    logger.info('Creating distributable')
    setup(name = 'ubb-se-example',
          console = [{'script' : startScript,
                      'ubb-se-example' : 'emc'}],
          options = options)
    
    
    # create a ZIP of dist folder
    logger.info('Creating ZIP of distributable: %s' %distZipFile)
    ziphandler = ZipFile(distZipFile, 'w')
    chdir(distDir)
    for root, dirs, files in walk('.'):
        for f in files:
            ziphandler.write(join(root, f))
    ziphandler.close()
    chdir('..')