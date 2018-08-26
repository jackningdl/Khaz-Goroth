# AWS上部署Java Web Project

### 创建AWS上EC2的instance

Download the `key pair` and save with a unique name

### Connect to the instance

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




