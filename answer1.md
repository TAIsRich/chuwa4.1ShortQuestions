1.
mkdir Assignment1
cd Assignment1
git init
2.
git clone https://github.com/Janne131058/Assignment1-4.5.git
3.
git remote add origin
git checkout -b Jill-assign1-branch
4.
git merge new-branch
5.
Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation. It simplifies the build process like ANT. But it is too much advanced than ANT.
We can easily build a project using maven.
We can add jars and other dependencies of the project easily using the help of maven.
Maven provides project information (log document, dependency list, unit test reports etc.)
Maven is very helpful for a project while updating central repository of JARs and other dependencies.
With the help of Maven we can build any number of projects into output types like the JAR, WAR etc without doing any scripting.
Using maven we can easily integrate our project with source control system (such as Subversion or Git).
6.
A Build Lifecycle is a well-defined sequence of phases, which define the order in which the goals are to be executed. Here phase represents a stage in life cycle. As an example, a typical Maven Build Lifecycle consists of the following sequence of phases.
7.
Package & install are various phases in maven build lifecycle. package phase will execute all phases prior to that & it will stop with packaging the project as a jar. Similarly install phase will execute all prior phases & finally install the project locally for other dependent projects.
8.
Passing by reference means the called functions’ parameter will be the same as the callers’   passed argument (not the value, but the identity - the variable itself). Pass by value means the called functions’ parameter will be a copy of the callers’ passed argument.

