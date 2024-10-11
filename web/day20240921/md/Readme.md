## todo-1: 如何在个人主页显示登录成功之后的邮箱地址？
- ![img_14.png](img_14.png)

## todo-1: 解法之一 - 需要动态内容 - dynamic content - 可以交给 Servlet ...
- 直接跳转到 html 页面，改成跳转到 Servlet
- 注意：JDK 15 及以上才支持文本块
- ![img_13.png](img_13.png)

## todo-1: 解法之一 - 传参 + 取参
- ![img_12.png](img_12.png)

## todo-2: email 直接附带在浏览器地址栏，不安全。如何改进？回顾之前学过知识

## todo-2: 解法之一或者说是todo-1的解法二...
- request.getRequestDispatcher("...").forward(req, resp);
- ![img_11.png](img_11.png)

## 观察地址栏差异
- ![img_10.png](img_10.png)

## todo-3: 把 maven.compiler.target 改回 11 (error) - 兼容旧版本的写法
- ![img_9.png](img_9.png)

## 把 maven.compiler.target 改回 17
- ![img_8.png](img_8.png)

## 新建 welcome.html
- ![img_7.png](img_7.png)

## todo-4: 新建 WelcomeServlet 并通过 ***.write(...) 的方式输出 welcome.html 的内容 ...
- 不要用 """ ... """ 文本块的新语法
- 要感受「麻烦」
- 我们会觉得麻烦，其他人也一样
- 进一步如何「解决麻烦」
- ![img_6.png](img_6.png)

## todo-4: 完善 WelcomeServlet 代码
- ![img_5.png](img_5.png)

## jsp: welcome.jsp - 探索 jsp 的本质 ...
- jsp 的本质是 Servlet
- ***.jsp 会被自动翻译成 Java 代码 ***_jsp.java
- ![img_4.png](img_4.png)

## 在 jsp 中方便的插入 Java 代码
- ![img_3.png](img_3.png)

## 增加几个 jsp 例子代码。理解它的本质，学会直接看自动生成的 ***_jsp.java 代码
- ![img_2.png](img_2.png)

## 服务器：更新 JDK 版本、安装 MySQL 服务器
- ![img_1.png](img_1.png)

## 课后作业：增删改查练习
- ![img.png](img.png)




## Homework
### HW: 按照作业要求，修改主页
- ![img_30.png](img_30.png)
### HW: 增加简历页面（轮廓）
- ![img_29.png](img_29.png)
### HW: 简历页面 - 增加简历下载链接 - 先直接链接到之前写好的 Servlet
- ![img_28.png](img_28.png)
### HW: 简历页面 - 增加真正处理简历下载的 Servlet (轮廓)
![img_27.png](img_27.png)
### HW: 简历页面 - 简历下载 - 改成下载 PDF 文件
- ![img_26.png](img_26.png)
### HW: 简历页面 - 简历下载 - 解决中文文件名的问题 ...
- 看控制台报错信息
- 外部官方资源 https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Headers/Content-Disposition
- ![img_25.png](img_25.png)
### StandardCharsets.UTF_8
- ![img_24.png](img_24.png)
### HW: 按照作业要求 - 增加登录页面 (轮廓)
- ![img_23.png](img_23.png)
### HW: 按照作业要求 - 完善登录页面 - 先直接用别人写好的 ...
- https://getbootstrap.com/docs/5.3/forms/overview/
- ![img_22.png](img_22.png)
### HW: 登录页面 - form 增加 method 和 action 属性，同时增加 LoginServlet (null)
- ![img_21.png](img_21.png)
### HW: 登录页面 - input 增加 name 属性
- ![img_20.png](img_20.png)
### HW: 登录页面 - input 增加 required 属性
- ![img_19.png](img_19.png)
### HW: 登录页面 - 参考之前的代码完善登录逻辑 ...
- 新建数据库、用户表
- 插入基础数据
- MyDBUtil + mysql 依赖
- ![img_18.png](img_18.png)
### 调用 request 的 getContextPath() 方法获取 context 路径
- ![img_17.png](img_17.png)
### HW: 增加登录成功之后的个人主页 - Dashboard
- ![img_16.png](img_16.png)
### HW: response.sendRedirect(...)
- ![img_15.png](img_15.png)


