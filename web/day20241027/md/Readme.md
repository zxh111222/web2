## 自动化检查三个 og 开头的标签
改进上次课写的工具类，增加优化提醒等...
- 错误：叉叉
    - ![img_31.png](img_31.png)
- 警告：三角形
    - ![img_32.png](img_32.png)

### 分析、拆解问题（老师）
- ![img_5.png](img_5.png)

### 分组实现。动手时间
把自己的想法变成代码
#### 组一：后端实现
- Java 代码模板
    - ![img_6.png](img_6.png)

#### 组二：前端实现
- 前端代码模板
    - ![img_7.png](img_7.png)

### 额外补充的点
- ![img_13.png](img_13.png)

## 进一步功能迭代：左右分屏
- ![img_12.png](img_12.png)
- https://github.com/Tencent/cherry-markdown
    - ![img_14.png](img_14.png)

### cherry-markdown: hello-world
- ![img_15.png](img_15.png)
- ![img_16.png](img_16.png)
- ![img_17.png](img_17.png)

### cherry-markdown: 自定义工具栏
- ![img_18.png](img_18.png)

### cherry-markdown: 覆盖全屏模式的 z-index
- ![img_19.png](img_19.png)
- ![img_20.png](img_20.png)

### cherry-markdown: 增加 callback.afterChange 配置 ...
每次 markdown 编辑器内容变化时都会更新 name=content 的 textarea 这个 input，确保后端 Servlet 可以正确获取博客内容
- ![img_25.png](img_25.png)

### cherry-markdown: 增加 fileUpload 配置，支持文件上传
- ![img_21.png](img_21.png)
- ![img_22.png](img_22.png)

### cherry-markdown: 在 blog-show 前端页面用纯预览的方式展示 markdown 内容
- ![img_26.png](img_26.png)

### cherry-markdown: .cherry-previewer 样式覆盖
- ![img_23.png](img_23.png)
- ![img_24.png](img_24.png)

## `数据库连接池` 与 `现实生活的例子`
- ![img_27.png](img_27.png)
- ![img_28.png](img_28.png)
- ![img_29.png](img_29.png)

## 修改 Properties 配置文件的字符编码
- ![img_33.png](img_33.png)

## SpringBoot 快速演示 + 课后作业
### 快速演示...
- 快速演示了如何创建 SpringBoot 项目
- 快速演示了如何不用额外安装 Tomcat 依旧可以启动项目
- 快速演示了如何快速修改端口
- 快速演示了如何部署并在服务器上运行 SpringBoot 项目
- ...

### 后续慢慢引出框架、及它们的本质
- 前提：先把当前的代码完善好，保证写过一定的代码量
- 后续再把所有现在感觉到`麻烦`的地方逐一替换、改进...
- 还有很多很多可以通过框架来提升开发效率、提升性能的地方
- ...
