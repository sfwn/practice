# Welcome to here

![my avatar][avatar]  
  
  

## Aid

to practice my git skill

## Q&A 

### 1. ssh

```$ ssh-keygen -t rsa -C 'your@email'```

add ```~/.ssh/id_rsa.pub``` to your github accout Settings ___SSH keys___ 

and that's okokok and you are not have to type your username & password everytime push.

It's cool.

### 2. ```git status -s```

```
$ git status -s
 M README
MM Rakefile
A  lib/git.rb
M  lib/simplegit.rb
?? LICENSE.txt
```  
let's look a table below:  

|left|right|example|what's the meaning|  
|:--:|:--:|:--:|--:|
|A||example.md|new and add to stage|  
|M||example.md|modified and staged|  
||M|example.md|modified without staged|  
|M|M|example.md|modified&staged but modified again without staged|  
|?|?|example.md|untracked file|  
  

 












[avatar]: https://avatars3.githubusercontent.com/u/13919034?v=3&s=96