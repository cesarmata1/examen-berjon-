<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
<h1>Listado de clientes</h1>
<table>
    <thead>
    <tr>
        <th>Nombre</th>
        <th></th>
        <th>Email</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.name}</td>
            <td></td>
            <td>${customer.email}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
