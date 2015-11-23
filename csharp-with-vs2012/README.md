# C# project using MSBuild/VsTestRunner

This project contains an example class with an associated unit test class. The associated Jenkins job will build this project, execute its unit tests and publish to a local repository. The Jenkins job will produce a test report to visually examine failing/successful tests.

This job requires the following tools on the Jenkins machine:

* MSBuild - tool to build Visual Studio solutions from command line. Bundled with the .NET framework or Visual Studio.

* VsTestRunner - tool to execute C# unit tests from command line.

The Visual Studio solution file contains 2 projects: one for the development code and one for the unit tests. The test project must reference the development one and also the Microsoft.VisualStudio.TestTools.UnitTesting namespace.

Necessary Jenkins plugins not installed by default:

* [Git plugin](https://wiki.jenkins-ci.org/display/JENKINS/Git+Plugin)

* [MSBuild plugin](https://wiki.jenkins-ci.org/display/JENKINS/MSBuild+Plugin) - to build the solution

* [VsTestRunner Plugin](https://wiki.jenkins-ci.org/display/JENKINS/VsTestRunner+Plugin) - to execute the unit tests in the project

* [MSTest plugin](https://wiki.jenkins-ci.org/display/JENKINS/MSTest+Plugin) - to convert the output of VSTest (*.trx) into a format Jenkins can understand (JUnit-style xml)