package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.entity.AdminDetails;

public interface AdminRepository extends JpaRepository<AdminDetails, Integer> {
	List<AdminDetails> readByAdminrole(String AdminRole);
	
	AdminDetails getByAdminemailidAndAdminpassword(String adminemailid,String adminpassword);
	
	@Query("select admin from AdminDetails admin where admin.adminemailid=?1 or admin.adminrole=?1 or admin.adminpassword=?1 ")
	List<AdminDetails>findByAdminroleOrAdminemailidOrAdminpassword(String filter);
}