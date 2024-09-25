<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2024/9/24
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String lang = (String) request.getAttribute("lang");
%>
<!DOCTYPE html>
<html lang="<%= lang %>">
<head>
    <title>多语言支持</title>
</head>
<body>
<h1><%= lang.equals("en") ? "Welcome" : "欢迎" %></h1>
<form action="HwLanguageServlet" method="get">
    <label>
        <input type="radio" name="lang" value="zh" <%= lang.equals("zh") ? "checked" : "" %>> 中文
    </label>
    <label>
        <input type="radio" name="lang" value="en" <%= lang.equals("en") ? "checked" : "" %>> English
    </label>
    <input type="submit" value="选择语言">
</form>
</body>
</html>
