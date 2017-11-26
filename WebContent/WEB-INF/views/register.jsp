<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>User Registration</title>

</head>
<body>
<h3><strong>Please fill the form to register!</strong></h3>
<form action="/CoffeeShopWebApp/addUser" method="post">
First Name: <input type="text" name="firstName"><br>
Last Name:  <input type="text" name="lastName"><br>
Email: <input type="text" name="email"><br>
Phone: <input type="text" name="phone"><br>
Password: <input type="text" name="password"><br><br>

<input type="submit" value="Register"><br>

</form>

</body>
</html>