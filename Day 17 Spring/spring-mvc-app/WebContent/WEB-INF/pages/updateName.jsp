<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Update Name </h2>
	<form action="spring-mvc/user/updateName" method="GET">
		id : <input type="number" name="id"><br />
		Name :<input type="text" name="name"><br />
		<input type="submit" value="Update">
	</form>
	<p>${message}</p>
</body>
</html>