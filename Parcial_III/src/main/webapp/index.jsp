<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="jakarta.servlet.http.*,jakarta.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>CICLASSSSSSSS</h1>
	<!-- Llamada de BD -->
	<sql:setDataSource var="dbSource" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/Biciparqueadero_Medio_Peso"
		user="root" password="1234" />

	<!-- SELECT -->
	<sql:query dataSource="${dbSource}" var="ciclas">
    SELECT * FROM Ciclas;
	</sql:query>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Color</th>
			<th>Marca</th>
			<th>Precio por Día</th>
			<th>Fecha de Prestamo</th>
			<th>Fecha de Entrega</th>
			<th>Tipo</th>
			<th>Talla</th>
			<th>Referencia</th>
		</tr>
		<c:forEach var="row" items="${Ciclas.rows}">
			<tr>
				<td>${row.id}</td>
				<td>${row.color}</td>
				<td>${row.marca}</td>
				<td>${row.precio_dia}</td>
				<td>${row.fecha_prestamo}</td>
				<td>${row.fecha_emtrega}</td>
				<td>${row.tipo}</td>
				<td>${row.talla}</td>
				<td>${row.referencia}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>