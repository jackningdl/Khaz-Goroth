# React Project Setup

### 1. Install `node.js`
[LTS Version](https://nodejs.org)
安装好以后查看npm版本
```
npm -v
```
### 2. 创建project包
```
mkdir my-project
cd my-project

npm init
```
配置初始package.json
```
package name:
version: (1.0.0) 
description:
entry point: (index.js) 
test command: 
git repository: 
keywords: 
author:
license: (ISC)
```
查看在包中产生的json(配置)文件:
```
less package.json
```
```JSON
{
  "name": "traveldiary",
  "version": "1.0.0",
  "description": "This is a react and GCP based web app.",
  "main": "index.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "author": "Dafei Ning",
  "license": "ISC"
}
```
### 3. 安装React App的创建工具
```
npm install -g create-react-app
```
### 4. 





npm install -S react-google-maps