# MongoDB

## 准备: 安装MongoDB

### MongoDB Community Edition手动安装
Download: linkhttps://www.mongodb.org/downloads#production 			
Extract(terminal):	
```
tar -zxvf mongodb-osx-ssl-x86_64-4.0.0.tgz
```

### 或用Homebrew安装
```
brew update		
brew install mongodb 
```

### 开启MongoDB的后台进程
```
cd ~/mongodb-osx-xxxx 	
mkdir db 	
./bin/mongod --dbpath db/
```
之后的数据都会在db文件夹中记录


## 创建数据库并写入数据

当显示如下时，说明mongodb进程已经启动：
```
2018-07-09T20:48:14.935-0700 I NETWORK  [initandlisten] waiting for connections on port 27017
```

**打开另一个terminal并cd到mongodb-osx-xxxx目录下:**
```
cd ~/mongodb-osx-xxxx 
```
**启动一个mongo shell:**
```
./bin/mongo
```
显示如下:
```
MongoDB shell version v4.0.0
connecting to: mongodb://127.0.0.1:27017
MongoDB server version: 4.0.0
Welcome to the MongoDB shell.
For interactive help, type "help".
For more comprehensive documentation, see
	http://docs.mongodb.org/
Questions? Try the support group
	http://groups.google.com/group/mongodb-user
Server has startup warnings: 
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] 
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] ** WARNING: Access control is not enabled for the database.
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] **          Read and write access to data and configuration is unrestricted.
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] 
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] ** WARNING: This server is bound to localhost.
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] **          Remote systems will be unable to connect to this server. 
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] **          Start the server with --bind_ip <address> to specify which IP 
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] **          addresses it should serve responses from, or with --bind_ip_all to
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] **          bind to all interfaces. If this behavior is desired, start the
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] **          server with --bind_ip 127.0.0.1 to disable this warning.
2018-07-09T20:48:14.824-0700 I CONTROL  [initandlisten] 
---
Enable MongoDB's free cloud-based monitoring service to collect and display
metrics about your deployment (disk utilization, CPU, operation statistics,
etc).

The monitoring data will be available on a MongoDB website with a unique
URL created for you. Anyone you share the URL with will also be able to
view this page. MongoDB may use this information to make product
improvements and to suggest MongoDB products and deployment options to you.

To enable free monitoring, run the following command:
db.enableFreeMonitoring()
---

> 
```

**创建一个新的database**
















