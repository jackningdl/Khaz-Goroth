# Flutter

Flutter is Google's UI toolkit for crafting beautiful, natively compiled applications for mobile, web, and desktop from a single codebase.

### 1. 下载 flutter installation bundle

https://flutter.dev/docs/get-started/install

### 2. 解压缩到指定文件夹

``` 
$ cd ~/development
$ unzip ~/Downloads/flutter_.zip
```

### 3. 添加路径

```
$ export PATH="$PATH:[PATH_TO_FLUTTER_GIT_DIRECTORY]/flutter/bin"
$ echo $PATH
```

### 4. 检查flutter所需要安装的dependencies

```
$ flutter doctor

✓] Flutter (Channel stable, v1.9.1)
[!] Android toolchain - develop for Android devices (Android SDK version 28.0.1)
    ✗ Flutter requires Android SDK 28 and the Android BuildTools 28.0.3
      To update using sdkmanager, run:
        "/Users/dafeining/Library/Android/sdk/tools/bin/sdkmanager" "platforms;android-28" "build-tools;28.0.3"
      or visit https://flutter.dev/setup/#android-setup for detailed instructions.
    ✗ Android licenses not accepted.  To resolve this, run: flutter doctor --android-licenses
[!] Xcode - develop for iOS and macOS (Xcode 10.1)
    ✗ CocoaPods not installed.
        CocoaPods is used to retrieve the iOS and macOS platform side's plugin code that responds to your plugin usage on the Dart side.
        Without CocoaPods, plugins will not work on iOS or macOS.
        For more info, see https://flutter.dev/platform-plugins
      To install:
        sudo gem install cocoapods
[!] Android Studio (version 3.1)
    ✗ Flutter plugin not installed; this adds Flutter specific functionality.
    ✗ Dart plugin not installed; this adds Dart specific functionality.
[!] IntelliJ IDEA Community Edition (version 2017.3.4)
    ✗ Flutter plugin not installed; this adds Flutter specific functionality.
    ✗ Dart plugin not installed; this adds Dart specific functionality.
[!] VS Code (version 1.39.0)
    ✗ Flutter extension not installed; install from
      https://marketplace.visualstudio.com/items?itemName=Dart-Code.flutter
[!] Connected device
    ! No devices available
```

### 5. 安装XCode

```
$ sudo xcode-select --switch /Applications/Xcode.app/Contents/Developer
```

调出License并agree:

```
$ sudo xcodebuild -license
```

### 6. 启动IOS的Simulator

```
$ open -a Simulator
```

### 7. 创建flutter App

```
$ flutter create my_app
```
### 8. 运行App

```
$ flutter run
```

### 9. VSCode开发环境

Extension
```
Dart
Material Icon Theme
```

### 10. Move project to another folder
```
flutter packages get
```