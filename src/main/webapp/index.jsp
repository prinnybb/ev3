<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario para Base de Datos</title>
</head>
<body>
    <h1>Formulario para Base de Datos</h1>

    <form action="TablaServletx" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre" required><br>

        <label for="apellido">Apellido:</label>
        <input type="text" name="apellido" id="apellido" required><br>

        <label for="edad">Edad:</label>
        <input type="number" name="edad" id="edad" required><br>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required><br>

        <input type="submit" value="Guardar en la Base de Datos">
    </form>
</body>
</html>
