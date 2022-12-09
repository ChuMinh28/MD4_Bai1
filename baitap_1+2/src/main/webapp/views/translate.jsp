<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/9/2022
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Hãy nhập từ bạn muốn dịch !</h2>
<form action="<%=request.getContextPath()%>/transController/translate" method="get">

    <input type="text" name="text">
    <input type="submit" value="trans">
</form>
<p>=> ${textOut}</p>
</body>
</html>
