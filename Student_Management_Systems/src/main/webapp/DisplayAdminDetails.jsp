<%@page import="com.student.entity.AdminDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>Admin Details</h1>
	<% List<AdminDetails> list =(List<AdminDetails>) request.getAttribute("alladmindetails"); %>
	
	<form action="filterData">
	
	<input type="search" placeholder="Enter Admin Role" name="adminrole" >
	<input type="submit" >
	</form>
	<br> 
	
<table border="1">
	<tr>
	<th>Email</th>
	<th>Password</th>
	<th>Role</th>
	</tr>
	<%
	for(AdminDetails adminDetails:list)
	{
	%>
	 <tr>
	 <td><%=adminDetails.getAdminemailid() %></td>
	 <td><%=adminDetails.getAdminpassword() %></td>
	 <td><%=adminDetails.getAdminrole() %></td>
	 <td>
	 <form action="getadminbyid">
	 <input value<%=adminDetails.getAdminid() %>  hidden="true"  name="adminid">
	 <input type="submit" value="update">
	 </form></td>
	 </tr>
	<%
	}
	%>
	
	
</table>
	</center>
</body>
</html>