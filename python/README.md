# Python project built with py2exe

This project contains an example class with an associated unit test class. The associated Jenkins job will build this project, execute its unit tests and create a distributable using py2exe. The Jenkins job will produce a test report to visually examine failing/successful tests.

Necessary programs installed on the Jenkins machine:

* Python

* Nosetests

* Py2exe

Necessary Jenkins plugins not installed by default:

* [Rich Text Publisher plugin](https://wiki.jenkins-ci.org/display/JENKINS/Rich+Text+Publisher+Plugin) - to publish the link to the latest release.