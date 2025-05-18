<%@page import="com.student.entity.StudentDetails"%>
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
		<%
		StudentDetails studentDetails = (StudentDetails) request.getAttribute("studentdetails");
		%>
		<h1>Student Details</h1>
		<!--  studentDetailsils %> -->
		<form action="update">
			<table border="1">
				<tr>
					<th>Student Name</th>
					<th>Student EmailId</th>
					<th>Student Mobile Number</th>
					<th>Student Stream</th>
					<th>Student Gender</th>
					<th>Student Percentage</th>
				</tr>
				<tr>

					<td><input type="text" value="<%=studentDetails.getSname()%>" name="sname"></td>
					<td><input type="text" value="<%=studentDetails.getSemailid()%>" name="semailid"></td>
					<td><input type="text" value="<%=studentDetails.getSmobile()%>" name="smobile"></td>
					<td><input type="text" value="<%=studentDetails.getStream()%>" name="stream"></td>
					<td><input type="text"value="<%=studentDetails.getSgender()%>" name="sgender"></td>
					<td><input type="text" value="<%=studentDetails.getSpercentage()%>" name="spercentage"></td>
					<td><input type="submit" value="UPDATE"></td>

				</tr>
			</table>
		</form>
	</center>
</body>
</html>