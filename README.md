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

***notice:***  

> ```$ ssh-keygen```  
> Generating public/private rsa key pair.  
> Enter file in which to save the key (/Users/sfwn/.ssh/id_rsa):~/.ssh/id_example  
> Enter passphrase (empty for no passphrase):  
> Enter same passphrase again:  
> Saving key "~/.ssh/id_example" failed: No such file or directory

**solution:**  
> I suppose the reason why openssh cannot find '~/.ssh/id_example' is that openssh cannot recognize the environment path in it, whatever it is "~" or "HOME".  
> But if you type like this: ```Enter file in which to save the key (/Users/sfwn/.ssh/id_rsa):/Users/sfwn/.ssh/id_example```, it works well and you can generate the ssh key pairs where you want to put.  
> Also you can solve this question by add param ***'-f'*** to specify the path like this below:  
> ```$ ssh-keygen -f ~/.ssh/id_example``` or ```$ ssh-keygen -f $HOME/.ssh/id_example```  
> the environment variables can be recognized in terminal so openssh konws where to put the key pairs. And it won't prompt "no such file or directory" anymore.

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