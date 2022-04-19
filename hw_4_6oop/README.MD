How to authenticate your github account through command line 
https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token

set upstream: git remote add upstream repo_url 

How to use fork and PR? 
1.	Find the repo you are interested, you can use this to try: https://github.com/TAIsRich/chuwa4.1ShortQuestions.git
2.	Click fork 
3.	Then login to your github, it will create a copy of this repo in your accout 
4.	Click code, then click right square after https to copy your repo url 
5.	Open terminal in your computer, change to the folder you are going to work
git clone url_you_copied, this will copy the project into your local computer 
6.	 cd project_dir 
7.	git checkout -b branch_name, to create your own branch and swich to your branch 
8.	then you can start working on this branch 
9.	9.	Under your working directory, create a folder for each assignment 
10.	update your branch and add all new files into the branch
git add .  
10.	git commit -m “add message about your update” 
11.	git push -u origin branch_name 
12.	then you can go to github, you will see compare and pull request. Click compare and pull request, then add the message about your merge. The owner will decide if they agree with your merge. 
13.	The owner can decide if they wanna merge your push. 

