# submitting assignment here.

> How to authenticate your github account through command line https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token

# set upstream: 
**git remote add upstream repo_url**
> git remote add upstream https://github.com/TAIsRich/chuwa4.1ShortQuestions.git

# How to use fork and PR?

Find the repo you are interested, you can use this to try: https://github.com/TAIsRich/chuwa4.1ShortQuestions.git
1. Click fork
2. Then login to your github, it will create a copy of my repo in your accout
3. Click code, then click right square after https to copy your repo url
4. Open terminal in your computer, change to the folder you are going to work **git clone url_you_copied**, this will copy the project into your local computer
5. cd project_dir
6. **git checkout -b branch_name**, to create your own branch and swich to your branch. **use your name as bracn_bane**. For example: **git checkout -b Lifang_Yan** 
7. then you can start working on this branch
Under your working directory, create a folder for each assignment
8. update your branch and add all new files into the branch. 
    - git add .
    - git commit -m “add message about your update”
    - git push -u origin branch_name
9. then you can go to github, you will see **compare and pull request**. Click compare and pull request, then add the message about your merge. The owner will decide if they agree with your merge. The owner can decide if they wanna merge your push.
    - notice that, you should **raise a PR to the branch named with your name**. don't raise a PR to master.
