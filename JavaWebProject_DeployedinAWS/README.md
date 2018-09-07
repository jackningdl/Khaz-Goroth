# AWS上部署Java Web Project
<br/>
<br/>

## 创建AWS上EC2的instance

Download the `key pair` and save with a unique name<br/>
<br/>
<br/>

## Connect to the instance

首先对key pair change mode:
```
chmod 600 ~/Downloads/mykey.pem
```

然后使用这个key pair，在SSH里对远程的instance进行链接:
```
ssh -i ~/Downloads/mykey.pem ubuntu@YOUR_INSTANCE_IP
例如：
ssh -i ~/Downloads/KeyPair.pem ubuntu@ec2-XX-XXX-116-XX.us-west-2.compute.amazonaws.com
```

之后会出现：
```
Welcome to Ubuntu 16.04.4 LTS (GNU/Linux 4.4.0-1061-aws x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/advantage

  Get cloud support with Ubuntu Advantage Cloud Guest:
    http://www.ubuntu.com/business/services/cloud

0 packages can be updated.
0 updates are security updates.



The programs included with the Ubuntu system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Ubuntu comes with ABSOLUTELY NO WARRANTY, to the extent permitted by
applicable law.

To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.
```
这时就会出现以远端instance为基的命令行 <br/>
也就是说可以控制远端的命令行了 <br/>
<br/>
<br/>


## 上传war包到instance
```
scp -i ~/KeyPair.pem  ~/Project.war ubuntu@XX.XXX.XXX.XXX:~
```
接下来就是等上载完成 <br/>
当然还要安装tomcat和sql<br/>
<br/>
<br/>

## 启动instance里的war

```
sudo cp ~/Project.war /opt/tomcat/webapps/
```
