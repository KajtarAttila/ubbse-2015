# Java project built with Gradle

This project contains an example class with an associated unit test class. The associated Jenkins job will build this project, execute its unit tests and publish to a local repository. The Jenkins job will produce a test report to visually examine failing/successful tests.

Necessary Jenkins plugins not installed by default:

* [Git plugin](https://wiki.jenkins-ci.org/display/JENKINS/Git+Plugin)

* [Gradle plugin](https://wiki.jenkins-ci.org/display/JENKINS/Gradle+Plugin)

* [Rich Text Publisher plugin](https://wiki.jenkins-ci.org/display/JENKINS/Rich+Text+Publisher+Plugin) - to publish the link to the latest release.