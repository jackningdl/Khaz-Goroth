# grpc setup

go get -u google.golang.org/grpc

go get -u github.com/golang/protobuf/protoc-gen-go



### project里

Generate code: 
```
protoc 
```

在project层定向generate code:
```
protoc xx/xx/aaa.proto --go_out=plugins=grpc:.
```


### VSCode Setup

- VSCode extensions: ```vscode-proto3```  & ```Clang-Format```  

- Clang-Format: MacOSX: ```brew install clang-format``` 
