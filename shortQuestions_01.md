# ShortQuestions_01

1. **What is the basic steps to init a git repo in you local?**

   Get token, fork and copy reop from others, clone to local computer, create a branch and switch to it, edit.

   

2. **How to clone a repo from Github?**

   After fork and copy others reop to your Github, use command line:

   ```bash
   git clone url_from_your_own_repo
   ```

   

3. **How to create a new branch and checkout to that branch?**

   After cloning the repo to the local computer, use command line:

   ```bash
   git checkout -b branch_name
   ```

   

4. **How to merge the new-branch to master branch? show me the commands.**

   Use the following two command lines first, then on your own Github, "compare" and "pull request" to merge.

   ```bash
   git commit -m "message aboutupdate"
   git push -u origin branch_name
   ```

   

5. **What is maven role? what it be used to do?**

   Maven is a powerful management tool used primarily for Java projects. It is based on POM (project object model), used for projects build, dependency and documentation.

   

6. **What is the lifecycle of maven? could you tell me the details?**

   Lifecycles refers to a well-defined sequence of phases, which define the order in which the goals are to be executed. There are three built-in lifecycles, default, clean and site. The default lifecycle handles your project deployment, the clean lifecycle handles project cleaning, while the site lifecycle handles the creation of your project's web site.

   

7. **What is the difference between package and install in maven lifecycle?**

   Package and install are two different phases/steps in maven lifecycle.

   Package: This step packages the compiled code in distributable format like JAR or WAR.

   Install: This step installs the packaged code to the local Maven repository.

   

8. **What is difference between passing by value and passing by reference? Could you design a code to verify your understanding and screenshot it to me?**

   Passing by value: variables are independently modified.

   Passing by reference: variables are pointing to the same reference, change one of the variables will affect the rest.

   ```java
   public class Demo{
   public static void main(String[] args) {
       //passing by value:
   int a = 10;
   int b = 10;
   b = 20 System.out.println(a); // 10 System.out.println(b); // 20
       //passing by reference:
   int[] ns = { 68, 79, 91, 85, 62 }; int[] c = ns;
   int[] d = ns;
   d[0] = 20; System.out.println(c[0]); // 20 System.out.println(c[0]); // 20
   } }
   ```

   

9. **Practice git and Github then provide one screenshot to prove you have done it.**

10.  **Create a maven project using IntelliJ like the teacher did in the class, send screenshot to me.**