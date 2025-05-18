<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Registration</title>
<style type="text/css">
	*{
	padding: 0px;
	margin: 0px;
	}
	body {
	background-color:black;
	height:auto;
	width:100%;
	display: flex;
	justify-content:center;
	align-items: center;  
	}
	h1{
		color: red;
		text-shadow: 2px 2px 5px olive;
	}
	input {
	display:flex;

	outline:none;
	border-style: 2px solid blue;
	padding: 10px;
	border-radius: 5px;
	
}
	form{
		height:30vh;
		box-shadow: 10px 10px 10px silver;
	}
#sub{
	display:flex;
	width: 80px;
	border-radius: 10%;
	background-color: violet;
	padding: 10px;
	text-align: center;
	color: blue;
	font-size: 1em;
	font-weight: bold;
	}
</style>
</head>
<body>

<center>
<h1>Admin Registration</h1> <br>
	<form action="adminregistration ">
		<input placeholder="Enter Admin EmailId"  name="adminemailid"> <br>
		<input placeholder="Enter Admin Password" name="adminpassword" > <br>
		<input placeholder="Enter Admin Role" name="adminrole" > <br>
		<input id="sub" type="submit">
	</form>
	</center>
</body>
</html>