# MySQL安装和创建数据库
<br/>
<br/>
## 1. 安装到instance

```
sudo apt-get install mysql-server
```
然后此处可能会要设置密码
<br/>
<br/>

## 2. 进入MySQL
安装完以后输入 `mysql -u root -p` 到instance对应的terminal, 然后输入密码
<br/>
<br/>
## 3. 初始化数据库
```
DROP DATABASE IF EXISTS MyDatabase;
CREATE DATABASE MyDatabase;
USE MyDatabase;
```
type `exit` to quit
<br/>
<br/>