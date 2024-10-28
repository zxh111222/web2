## 关于阿里云服务器 ECS 试用到期
### 释放服务器（建议操作）
- https://help.aliyun.com/zh/ecs/ecs-free-trial
- ![img.png](img.png)

## 讲解完整的「用户管理」功能
### 重点强调
- 务必自己敲代码实现「用户管理」所有功能
- “用户”的增删改查学会了之后，“博客”、“商品”...等等其他类型系统的底层实现逻辑都类似
- 只不过后续会用更方便的框架来解决，但是：框架的本质也是对这些底层功能的封装而已
- 再实现「用户管理」的增删改查功能过程中，遇到以前学过，但是忘记的知识点，要及时去复习，看之前的笔记或代码
- ...

### 功能点图示
- ![img_1.png](img_1.png)

### 部分功能的图文解释
#### 增加用户
- ![img_2.png](img_2.png)
#### 删除用户
- ![img_3.png](img_3.png)
#### 修改用户
- ![img_5.png](img_5.png)
#### 查询用户
  - ![img_6.png](img_6.png)

## 新知识：Listener
- 监听器（Listener）：Java Web 三大技术组件之一
- 之前已经学过了另外两个：Servlet 和 Filter
### 本节案例：ServletContextListener
监听整个应用的生命周期（启动、销毁）并根据自己的业务逻辑，在特定的时机添加自己的逻辑
- ![img_11.png](img_11.png)
- ![img_10.png](img_10.png)
- ![img_12.png](img_12.png)
### 还有很多其他的 Listener
后续遇到的时候，再进一步讲解。比如：
- ![img_13.png](img_13.png)

## 其他
- 以前讲 Servlet 划过的图
  - ![img_7.png](img_7.png)
- 以前讲 Filter 画过的图
  - ![img_8.png](img_8.png)
- 以前的知识：JDBC
  - https://gitee.com/iae23a12/iae-se-maven/tree/main/src/main/java/day240812/note
- 以前的知识：MySQL
  - https://gitee.com/iae23a12/iae-se-maven/tree/main/src/main/java/day240809/note#mysql
- 以前的知识：try-with-resources
  - ![img_4.png](img_4.png)

