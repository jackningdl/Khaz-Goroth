# Docker

### 从Dockerhub里拉image:
```
docker pull [选项][Docker Registry 地址[:端口号]/]仓库名[:标签]
```
具体选项查询：
```
docker pull --help

```

pull image:
```
docker pull ubuntu:16.04

16.04: Pulling from library/ubuntu
7b8b6451c85f: Pull complete 
ab4d1096d9ba: Pull complete 
e6797d1788ac: Pull complete 
e25c5c290bde: Pull complete 
Digest: sha256:e547ecaba7d078800c358082088e6cc710c3affd1b975601792ec701c80cdd39
Status: Downloaded newer image for ubuntu:16.04
```
### 运行：

```
docker run -it --rm ubuntu:16.04 bash
```
Linux查看当前系统版本的命令
```
cat /etc/os-release
```
```
NAME="Ubuntu"
VERSION="16.04.5 LTS (Xenial Xerus)"
ID=ubuntu
ID_LIKE=debian
PRETTY_NAME="Ubuntu 16.04.5 LTS"
VERSION_ID="16.04"
HOME_URL="http://www.ubuntu.com/"
SUPPORT_URL="http://help.ubuntu.com/"
BUG_REPORT_URL="http://bugs.launchpad.net/ubuntu/"
VERSION_CODENAME=xenial
UBUNTU_CODENAME=xenial
```
To exit the current image:
```
root@fbaf8b8b0a6d:/# exit
exit
```
查看当前已经下载下来的镜像：
```
docker image ls
```

