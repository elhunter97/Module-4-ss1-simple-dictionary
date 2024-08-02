<%--
  Created by IntelliJ IDEA.
  User: WINDOWS
  Date: 8/3/2024
  Time: 2:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Từ điển Anh-Việt</title>
</head>
<body>
<form method="post">
    <h3>Nhập từ cần tìm: <input type="text" name="word"></h3>
    <button type="submit">Dịch</button>
</form>
<p> <c:out value="${result}"/></p>
<p></p>
</body>
</html>
