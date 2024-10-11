## `What is a Servlet` and `What is a Servlet Container`
- 上次课我们是直接阅读了 Servlet 源码中的注释
- 这次课我们阅读 Jakarta EE 的 Servlet 规范文档，同样是一手资源
- ![img.png](img.png)

## Jakarta EE 项目的 `src` 和 `target` 的对应关系
- ![img_1.png](img_1.png)

## 问题：浏览器看到的效果跟自己期待的不一致
- 参考下图的提示排查
- ![img_2.png](img_2.png)

## HTTP 协议之 request 解释
- ![img_3.png](img_3.png)

## HTTP 协议之 response 解释
- ![img_4.png](img_4.png)

## 动手时间 1：持续多语言/国际化的页面显示功能
- ![img_5.png](img_5.png)
- 思考：是通过 Servlet 的 request 还是 response 获取相关信息？
- 连懵带猜：自己挖掘 request 或 response 对象中有哪些相关的 behavior 或 state
    - 通过 `.` 自己探索

## 用 IDEA 提供的 `HTTP Request` 工具测试效果
也从侧面说明了，Web Client 不止浏览器
- ![img_6.png](img_6.png)
- ![img_7.png](img_7.png)
- ![img_8.png](img_8.png)

## 动手时间 2：上一个功能的升级 - 支持用户自己指定要显示什么语言
- ![img_9.png](img_9.png)

### 验证效果
- ![img_10.png](img_10.png)

## 动手时间 3：给当前项目新增一个 index.html 汇总显示所有核心链接和说明
- ![img_11.png](img_11.png)
- 比如：
    - ![img_12.png](img_12.png)

## 同一个 Servlet 可以关联多个 URL
- ![img_13.png](img_13.png)

## 由上一张截图引出 Tomcat 默认提供的 DefaultServlet
- 完整路径：`org.apache.catalina.servlets.DefaultServlet`
- ![img_14.png](img_14.png)
- ![img_15.png](img_15.png)
- ![img_16.png](img_16.png)

## 继续引出：`通过注解配置 Servlet` vs `在 web.xml 中配置`
- ![img_17.png](img_17.png)

## 动手时间 4：自己探索如何从`请求行`中获取各种信息
- ![img_18.png](img_18.png)

## 购买自己的服务器
- aliyun
- 详见：当天最后一节的视频，或下次课的笔记
