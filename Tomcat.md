# EC2安装Tomcat

### Install and startup Tomcat
Instance目录下：

```
cd /opt/
```
```
sudo wget http://mirrors.XXXX/tomcat-9/v9.0.11/bin/apache-tomcat-9.0.11.tar.gz
```
```
sudo tar xzf apache-tomcat-9.0.11.tar.gz
sudo ln -s apache-tomcat-9.0.11 tomcat
echo "export CATALINA_HOME=\"/opt/tomcat\"" >> ~/.bashrc
source ~/.bashrc
cd /opt/tomcat
sudo bin/startup.sh
```

### Change the HTTP port from 8080 to 80
Instance目录下：
```
sudo vim /opt/tomcat/conf/server.xml
```
Restart Tomcat:
```
sudo /opt/tomcat/bin/shutdown.sh
```
```
sudo /opt/tomcat/bin/startup.sh
```
### Make Tomcat auto start
创建一个文件
```
sudo vim /etc/init.d/tomcat
```
复制下面的内容：
```
#!/bin/bash

### BEGIN INIT INFO
# Provides: tomcat
# Required-Start: $network
# Required-Stop: $network
# Default-Start: 2 3 4 5
# Default-Stop: 0 1 6
# Short-Description: Start/Stop Tomcat server
### END INIT INFO

PATH=/sbin:/bin:/usr/sbin:/usr/bin

start() {
 sh /opt/tomcat/bin/startup.sh
}

stop() {
 sh /opt/tomcat/bin/shutdown.sh
}

case $1 in
  start|stop) $1;;
  restart) stop; start;;
  *) echo "Run as $0 <start|stop|restart>"; exit 1;;
esac
```
让这个文件可以执行：
```
sudo chmod +x /etc/init.d/tomcat
```
Update bashrc to catch script:
```
sudo update-rc.d tomcat defaults
```
### Make Tomcat auto restart everyday

1. Instance目录下：
```
sudo crontab -e
```
2. 选择 3 vim .basic
3. 在最下面，输入：
```
0 1,13   *   *   *   sudo /etc/init.d/tomcat restart
```
意思是每天 1:00 和 13:00 Tomcat自动restart
