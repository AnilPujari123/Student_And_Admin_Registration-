package com.student.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.protobuf.Option;
import com.student.entity.AdminDetails;
import com.student.repository.AdminRepository;
@Component
public class AdminDAO {
	@Autowired
	AdminRepository adminRepository;
	public AdminDetails insertAdminDetails(AdminDetails adminDetails) {
		return adminRepository.save(adminDetails);
	}
	
	public List<AdminDetails> selectAllAdminDertails(){
		/*findAll() is used to fetch more than one object from DataBase
		 * It is the non-static method present on JpaRepository
		 * It is return type method it */
		List<AdminDetails> listOfAdminDetails = adminRepository.findAll();
		return listOfAdminDetails;
	}
	
	public AdminDetails selectAdminByUsingId(int adminid ) {
		Optional<AdminDetails> findById=adminRepository.findById(adminid);
		AdminDetails adminDetails=findById.get();
				return adminDetails;
	}
	
	public List<AdminDetails> selectAdminDetailsByUsingRole(String role){
		return adminRepository.findByAdminroleOrAdminemailidOrAdminpassword(role);
	}
	
	public AdminDetails getAdminDetailsUsingEmailidAndPassword(String adminemailid,String adminpassword) {
		return adminRepository.getByAdminemailidAndAdminpassword(adminemailid, adminpassword);
	}
}
