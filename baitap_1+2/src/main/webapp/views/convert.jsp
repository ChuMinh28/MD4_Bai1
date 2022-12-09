<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/8/2022
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<h1>Enter USD to Convert:</h1>
<form action="<%=request.getContextPath()%>/changeMoney/trans" method="get">
    <input type="text" name="usd" placeholder="USD" value="${usd}">
    <input type="submit" value="trans">
</form>
<h2>${vnd}</h2>
</body>
</html>
