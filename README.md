
* [Welcome to here](#welcome-to-here)
	* [Aid](#aid)
	* [Q&A](#qa)
		* [1. ssh](#1-ssh)
		* [2. ```git status -s```](#2-git-status--s)
		* [3. ```git fetch -p```](#3-git-fetch--p)
		* [4. new branch and push to it](#4-new-branch-and-push-to-it)

# Welcome to here  

![my avatar][avatar: url]  

[csdn](http://blog.csdn.net/shifangwannian)

## Aid  

to practice my git skill  

## Q&A  

### 1. ssh  

- ```$ ssh-keygen -t rsa -C 'your@email'```  

- add ```~/.ssh/id_rsa.pub``` to your github accout Settings ___SSH keys___  

- and that's okokok and you are not have to type your username & password everytime push.  

**It's cool.**  

### 2. ```git status -s```  

~~~
$ git status -s
 M README
MM Rakefile
A  lib/git.rb
M  lib/simplegit.rb
?? LICENSE.txt
~~~  

let's look a ***table*** below:  

|left|right|example|what's the meaning|  
|:--:|:--:|:--:|--:|
|A||example.md|new and add to stage|  
|M||example.md|modified and staged|  
||M|example.md|modified without staged|  
|M|M|example.md|modified&staged but modified again without staged|  
|?|?|example.md|untracked file|  

### 3. ```git fetch -p```  

**scene**: remote branch _linjun_ has been deleted, but local branch _linjun_ still exist.  
**aid**: to delete local branch _linjun_

```
~/paas-console$ git fetch -p
Username for 'http://git.terminus.io': lj@terminus.io
Password for 'http://lj@terminus.io@git.terminus.io':
From http://git.terminus.io/pampas/paas-console
 x [deleted]         (none)     -> origin/linjun
```

### 4. new branch and push to it  

- ```$ git branch sfwn```  

- ```$ git checkout sfwn```  

- do something and commit  

- ```$ git push```  

> fatal: The current branch sfwn has no upstream branch.  
> To push the current branch and set the remote as upstream, use

>    ```git push --set-upstream origin sfwn```  

- ```$ git push --set-upstream origin sfwn```  

- ```$ git push```  

- ok












[avatar: url]: https://avatars3.githubusercontent.com/u/13919034?v=3&s=96