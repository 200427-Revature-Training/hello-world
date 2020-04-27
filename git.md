# Git Basic Concepts

1. Repository
Repository is a structure for storing changes of source over time.
Generally, each project will have a repository.  Note: A repository
is local to your machine - the repository I have or your batch mate
has are distinct repositories from your own.

We can initialize a new repository by using the command 'git init' 
at the directory that is the 'root' for the project.

2. Adding files
By default no files are considered a part of the repository (tracked files),
we need to add files for the repository to track new or changed files.
To add files we can use "git add <file name or directory>".

3. Committing
Committing is the process of saving the new state (or changes) to
files as part of the repository. Note that this does not delete
the old state, it simply adds a new commit to the commit history.
Commit frequently. You cannot commit too often. We can commit the 
added files using 'git commit' - NOTE: Committing requires a commit 
message. If you simply type 'git commit' it's going to open up an 
editor in whatever editor is set to the default - which is probably
VIM. You can commit without using vim by providing a message within
the command line operation using `git commit -m "message"`

4. Add a remote
We can add a remote to our repository to make it easier for us to interact with
by using the 'git remote' command.  Generally, following this structure:
`git remote add <remote-name> <remote url/path>`

5. Pushing
Pushing pushes the history of a repository to another repository, assuming
they have compatible histories. We can push a repository by using 'git push',
generally also including a remote repository location and the branch we are pushing.








