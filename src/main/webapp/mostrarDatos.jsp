<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Datos de la Base de Datos</title>
</head>
<body>
    <h1>Datos de la Base de Datos</h1>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Edad</th>
            <th>Email</th>
        </tr>
        <c:forEach items="${tablas}" var="tabla">
            <tr>
                <td>${tabla.id}</td>
                <td>${tabla.nombre}</td>
                <td>${tabla.apellido}</td>
                <td>${tabla.edad}</td>
                <td>${tabla.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
