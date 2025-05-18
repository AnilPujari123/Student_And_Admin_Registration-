<html>
<body>
<% String msg=(String)  request.getAttribute("msg"); %>

<center>
	<%if(msg!=null){%>
	<h1 style="color: red"><%=msg %></h1>
	<% }%>
	<h2>Login Page</h2>
	
	<form action="adminlogin">
		
	<input placeholder="Enter Email Id" name="emailid"> <br>
	<input placeholder="Enter Password" name="passwpord"> <br>
	<input type="submit">
	</form>
	
	</center>
</body>
</html>
z