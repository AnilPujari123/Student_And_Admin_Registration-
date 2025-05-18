package com.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.DAO.AdminDAO;
import com.student.entity.AdminDetails;

@Controller
public class AdminController {
	@Autowired
	 AdminDAO adminDAO;
	@RequestMapping("/adminRegistrationPage")
	public String adminRegistrationPage() {
		
		return "AdminRegistration";
	}
	@RequestMapping("/adminregistration")
	public String adminRegistration(AdminDetails adminDetails,Model model)
	{
		System.out.println(adminDetails);
		AdminDetails insertAdminDetails  = adminDAO.insertAdminDetails(adminDetails);
		if (insertAdminDetails.getAdminid()>0) {
			return "redirect:/alladmindetails";
		} else {
			return null;
		}
	}
	
	@RequestMapping("/alladmindetails")
	public String displayAllAdminDetails(Model model) {		
		List<AdminDetails> allAdminDertails = adminDAO.selectAllAdminDertails();
		model.addAttribute("alladmindetails", allAdminDertails);
		return "DisplayAdminDetails";
	}
	@RequestMapping("/getadminbyid")
	public void getAdminDetailsByUsingId(@RequestParam("adminid") int adminid){
		System.out.println(adminid);
		AdminDetails adminDetails =adminDAO.selectAdminByUsingId(adminid);
		System.out.println(adminDetails);
	}
	@RequestMapping("/filterData")
	public String filterAdminByUsingRole(@RequestParam("adminrole")String role, Model model) {
		List<AdminDetails> usingRole = adminDAO.selectAdminDetailsByUsingRole(role);
		model.addAttribute("alladmindetails", usingRole) ;
		System.out.println(usingRole);
		return "DisplayAdminDetails";
	}
	@RequestMapping("/adminlogin")
	public String adminLogin(@RequestParam("emailid") String adminemailid, @RequestParam("passwpord") String adminpassword,Model model) {
		AdminDetails adminLogin = adminDAO.getAdminDetailsUsingEmailidAndPassword(adminemailid, adminpassword);
		
		if (adminLogin!=null) {
			return "redirect://alladmindetails";
		} else {
			model.addAttribute("msg", "Invalid Emailid Or Password!!!");
			return "index";
			
			

		}
	}
}
