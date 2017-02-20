<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>dubbo-demo</title>
</head>
<body>
       响应结果: ${result}<br>
        <table border="1">
            <caption>用户列表</caption>
            <tr>
                <td>id</td>
                <td>username</td>
                <td>phone</td>
                <td>email</td>
                <td>password</td>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.phone}</td>
                    <td>${user.email}</td>
                    <td>${user.password}</td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
