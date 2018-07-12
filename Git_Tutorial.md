
设置Git的默认编辑器：
```
git config --global core.editor "subl -n -w"
```


如果发生以下情况：

```
$ git push -u origin master
To https://github.com/jackningdl/Khaz-Goroth.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/jackningdl/Khaz-Goroth.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
```
解决方法：

```
git pull origin
```