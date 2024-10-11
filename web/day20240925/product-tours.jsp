<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2024/9/25
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>新手指引</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/driver.js@1.0.1/dist/driver.css"/>
</head>
<body>
<h1>新手指引</h1>
<h2 id="title1" class="driver-active-element">第一步</h2>
<p>
  随机文字随机文字随机文字随机文字<br>
  随机文字随机文字随机文字随机文字<br>
  随机文字随机文字随机文字随机文字<br>
  随机文字随机文字随机文字随机文字<br>
  随机文字随机文字随机文字随机文字<br>
  随机文字随机文字随机文字随机文字<br>
</p>
<h2 id="title2" class="driver-active-element">第二步</h2>
<p>
  肚子饿了，晚上没吃饭<br>
  肚子饿了，晚上没吃饭<br>
  肚子饿了，晚上没吃饭<br>
  肚子饿了，晚上没吃饭<br>
  肚子饿了，晚上没吃饭<br>
  肚子饿了，晚上没吃饭<br>
</p>
<h2 id="title3" class="driver-active-element">第三步</h2>
<p>
  走，去吃夜宵<br>
  走，去吃夜宵<br>
  走，去吃夜宵<br>
  走，去吃夜宵<br>
  走，去吃夜宵<br>
  走，去吃夜宵<br>
  走，去吃夜宵<br>
</p>
<h2 id="title4" class="driver-active-element">第四步</h2>
<p>
  还是没吃饱<br>
  还是没吃饱<br>
  还是没吃饱<br>
  还是没吃饱<br>
  还是没吃饱<br>
  还是没吃饱<br>
  还是没吃饱<br>
</p>
</body>
<script src="https://cdn.jsdelivr.net/npm/driver.js@1.0.1/dist/driver.js.iife.js"></script>

<c:if test="${isNewUser}">
  <script>
    const driver = window.driver.js.driver;

    const driverObj = driver({
      showProgress: true,
      allowClose: false,
      steps: [
        { element: '#title1', popover: { title: '万事开头难', description: '大胆迈出第一步', side: "left", align: 'start' }},
        { element: '#title2', popover: { title: '肚子饿', description: '肚子好饿！！！！', side: "bottom", align: 'start' }},
        { element: '#title3', popover: { title: '吃夜宵', description: '走，吃夜宵去', side: "bottom", align: 'start' }},
        { element: '#title4', popover: { title: '还是饿', description: '吃完还是很饿，还想吃', side: "bottom", align: 'start' }},
        { popover: { title: 'Happy Coding', description: '吃吃，整天就想着吃？' } }
      ],
      // onDestroyStarted is called when the user tries to exit the tour
      onDestroyStarted: () => {
        if (!driverObj.hasNextStep() || confirm("Are you sure?")) {
          driverObj.destroy();
        }
      },
      // onDestroyed is called after the driver is destroyed.
      onDestroyed: () => {
        console.log("driverObj destroyed!");
      },
    });

    driverObj.drive();
  </script>
</c:if>


</html>