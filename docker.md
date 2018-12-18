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
```
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
nginx                   latest              568c4670fa80        7 days ago          109MB
ubuntu                  16.04               a51debf7e1eb        2 weeks ago         116MB
x                       latest              20718b514c59        8 months ago        1.31GB
x                       <none>              dd5ba295b6d3        8 months ago        1.15GB
```

查看镜像，容器，数据卷所占用空间：
```
docker system df
```
```
TYPE                TOTAL               ACTIVE              SIZE                RECLAIMABLE
Images              4                   2                   2.031GB             884.5MB (43%)
Containers          15                  0                   263.4MB             263.4MB (100%)
Local Volumes       0                   0                   0B                  0B
Build Cache         0                   0                   0B                  0B
```


查看虚悬镜像(dangling image):
```
docker image ls -f dangling=true
```

### 删除镜像：
```
docker image rm [choice] <image1> [<image2>...]
```
用 ID which is a short ID删除:
```
docker image rm dd5b
```

用Repository name删除:
```
docker image rm x
```
用镜像摘要：
```
docker image ls --digests
```
```
docker image rm node@sha256:7b498e582c3e004e46b7d
```


## 创建Docker的过程

1. 用Dockerfile创造初始文件 (base, install, start)
2. 给Docker Image上标签









