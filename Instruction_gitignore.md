# Git中的 .gitignore


### 创建 .gitignore


### Regulation

1. 空行或是以`#`开头的行即注释行将被忽略。
2. 可以在前面添加正斜杠`/`来避免递归,下面的例子中可以很明白的看出来与下一条的区别
3. 可以在后面添加正斜杠`/`来忽略文件夹，例如`build/`即忽略build文件夹。
4. 可以使用`!`来否定忽略，即比如在前面用了`*.apk`，然后使用`!a.apk`，则这个`a.apk`不会被忽略。
5. `*`用来匹配零个或多个字符，如`*.[oa`忽略所有以".o"或".a"结尾，`*~`忽略所有以"~"结尾的文件（这种文件通常被许多编辑器标记为临时文件）；`[]`用来匹配括号内的任一字符，如`[abc]`，也可以在括号内加连接符，如`[0-9]`匹配0至9的数；`?`用来匹配单个字符。
<br/>

例子:
```Git ignore
# 忽略 .a 文件
*.a
# 但否定忽略 lib.a, 尽管已经在前面忽略了 .a 文件
!lib.a
# 仅在当前目录下忽略 TODO 文件， 但不包括子目录下的 subdir/TODO
/TODO
# 忽略 build/ 文件夹下的所有文件
build/
# 忽略 doc/notes.txt, 不包括 doc/server/arch.txt
doc/*.txt
# 忽略所有的 .pdf 文件 在 doc/ directory 下的
doc/**/*.pdf
```

作者：wavever
链接：https://www.jianshu.com/p/ea6341224e89




