# AndroidDialogProgress


为了方便使用DialogProgress，做了此工具类。

## 调用示例
```

# 全局显示和关闭，调用方便
DialogGlobal.show(this,"请等待")
DialogGlobal.dismiss()


# 创建Dialog
val dialog = DialogProgress.wait(this,null,true)
dialog?.show()
dialog?.dismiss()

DialogProgress.wait(this,"Hello World")?.show()

val builder = DialogProgress.builder(this,"Hello World")

```

## 引入
1. 在项目根目录的 build.gradle 加入以下repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
2. 加入依赖
```
dependencies {
    implementation 'com.gitee.kevinvane:DialogGlobal:3.0.0'
}
```