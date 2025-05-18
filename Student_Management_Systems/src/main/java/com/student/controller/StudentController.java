package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.DAO.StudentDAO;
import com.student.entity.StudentDetails;


@Controller
public class StudentController {
//	@RequestMapping("/registration")
//	@ResponseBody
//	public String studentRegistration(
//			@RequestParam("sname") String name,
//			@RequestParam("semailid") String emailid,
//			@RequestParam("smobile") String mobilenumber,
//			@RequestParam("sgender") String gender,
//			@RequestParam("stream") String stream,
//			@RequestParam("spercentage") String percentage,
//			@RequestParam("spassword") String password
//			)
//	{
//		System.out.println("Student Name : "+ name);
//		System.out.println("Student EmailId : "+emailid);
//		System.out.println("Student Mobile Number : "+mobilenumber);
//		System.out.println("Student Gender : "+gender);
//		System.out.println("Student Stream : "+stream);
//		System.out.println("Student Percentage : "+ percentage);
//		System.out.println("Student Password : "+password);
//		return "<center> <table border=2 >"
//				+ "<tr>"
//				+ "<th>Student Name </th> "
//				+ "<th> Email Id </th>"
//				+ " <th> Password </th>"
//				+ " <th> Mobile Number </th> "
//				+ "</tr>"
//				+ "<tr> "
//				+ "<td>"+name+" </td> "
//				+ "<td>"+emailid+"</td> "
//				+ "<td>"+password+"</td>"
	
//				+ "<td>"+mobilenumber+"</td>"
//				+ "</tr>"
//				+ " </table> </center>";
//		
//	}
		@Autowired
		private StudentDAO studentDAO;
	@RequestMapping("/registration")
public String studentRegistration(StudentDetails sd, Model model ) {
		
//		System.out.println(sd);
		StudentDetails details = studentDAO.insertStudentDetails(sd);
				model.addAttribute("studentdetails",details);
		return "DisplayStudentDetails";
		
}	
	@RequestMapping("/update")
	public String updateRegistration(StudentDetails ud,Model mode)
	{
		mode.addAttribute("updatedetails",ud);
//		System.out.println(ud);
		return "UpdatedStudentDetails";
		
	}
	@RequestMapping("/deletion")
	public String deleteRegistration()
	{
		return "Deletion Successfull";
		
	}
	@RequestMapping("/registrationpage")
	public String studentRegistrationPage()
	{
		return "StudentRegistration";
		
	}
}
