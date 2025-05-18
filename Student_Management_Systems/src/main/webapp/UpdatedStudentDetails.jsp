
<%@page import="com.student.entity.StudentDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updated</title>
</head>
<body>
 <center>
 <% StudentDetails updateDetails= (StudentDetails) request.getAttribute("updatedetails");  %>
 
	<h2> Updated Details </h2>
	
	<table border="1">
	<tr> <th>Student Name</th> <td><%=updateDetails.getSname() %></td> </tr>
	<tr> <th>Student EmailId</th> <td><%=updateDetails.getSemailid() %></td> </tr>
	<tr> <th>Student Mobile Number</th> <td><%=updateDetails.getSmobile() %></td> </tr>
	<tr> <th>Student Stream</th> <td><%=updateDetails.getStream() %></td> </tr>
	<tr> <th>Student Gender</th> <td><%=updateDetails.getSgender() %></td> </tr>
	<tr> <th>Student Percentage</th> <td><%=updateDetails.getSpercentage() %></td> </tr>
	</table>
	</center>
</body>
</html>