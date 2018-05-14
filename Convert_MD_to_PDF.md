要求

支持Github-Favored Markdown特性：由于Github-Favored Markdown 对代码高亮支持比较好，所以这里要求支持Github-Favored Markdown特性。
可以完全在命令行模式下完成：从编辑到转换
过程足够简单
解决方法

使用 grip 开启浏览器显示 markdown 文件，再通过浏览器插件将网页另存为 pdf 文件。

环境

系统：Ubuntu 
工具：grip， firefox

方法：

安装 grip

pip install grip
1
浏览器预览文件

grip youfileName
1
打开浏览器http://localhost:port/预览保存文件到 pdf

* 注意！ port 为端口号，默认为5000，需根据终端提示输入对应端口号 *


pip install grip  
grip your_markdown.md

grip your_markdown.md --export your_markdown.html




npm install -g markdown-pdf
markdown-pdf /path/to/markdown
