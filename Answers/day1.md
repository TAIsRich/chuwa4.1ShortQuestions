# Day1

## 1. What is the basic steps to init a git repo in you local?

Create a directory to contain the project.
Go into the new directory.
Type git init.
Write some code.
Type git add to add the files (see the typical use page).
Type git commit.

## 2. How to clone a repo from Github?

git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY

## 3. How to create a new branch and checkout to that branch?

You can use git checkout on the command line to create a new branch, change your current working branch to a different branch, or even to switch to a different version of a file from a different branch with git checkout [branchname] [path to file].

## 4. How to merge the new-branch to master branch? show me the commands

First we run git checkout master to change the active branch back to the master branch. Then we run the command git merge new-branch to merge the new feature into the master branch.

## 5.What is maven role? what it be used to do?

Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation.

## 6. What is the lifecycle of maven? could you tell me the details?

The default Maven lifecycle consists of 8 major steps or phases for compiling, testing, building and installing a given Java project as specified below:

1. Validate: This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
2. Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
3. Test: It runs unit tests for the project.
4. Package: This step packages the compiled code in distributable format like JAR or WAR.
5. Integration test: It runs the integration tests for the project.
6. Verify: This step runs checks to verify that the project is valid and meets the quality standards.
7. Install: This step installs the packaged code to the local Maven repository.
8. Deploy: It copies the packaged code to the remote repository for sharing it with other developers.

## 7. What is difference between passing by value and passing by reference?

“Passing by value” refers to passing a copy of the value. “Passing by reference” refers to passing the real reference of the variable in memory.

## 8. Could you design a code to verify your understanding and screenshot it to me?

## 9. practice git and github then provide one screenshot to prove you have done it.

## 10. create a maven project using Intellij like the teacher did in the class, send screenshot to me.
