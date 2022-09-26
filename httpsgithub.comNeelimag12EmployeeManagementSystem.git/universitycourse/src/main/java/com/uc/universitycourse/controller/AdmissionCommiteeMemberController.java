package com.uc.universitycourse.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.uc.universitycourse.service.AdmissionCommiteeMemberServiceImpl;
import com.uc.universitycourse.entities.AdmissionCommiteeMember;
import com.uc.universitycourse.entities.Applicant;
import com.uc.universitycourse.exception.ApplicantNotFoundException;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdmissionCommiteeMemberController {
	@Autowired
	private AdmissionCommiteeMemberServiceImpl admincomitte;
	
	@PostMapping("/createMember")
	public AdmissionCommiteeMember createMember(@RequestBody AdmissionCommiteeMember member) {
		return admincomitte.addCommiteeMember(member);
	}
	@PutMapping("/updateMember/{adminId}")
	public AdmissionCommiteeMember updateMember(@RequestBody AdmissionCommiteeMember member ,@PathVariable int adminId) {
		return admincomitte.updateCommiteeMember(member ,adminId);
	}
	@GetMapping("/getMember/{adminName}")
	public AdmissionCommiteeMember getMember(@PathVariable String adminName) {
		return admincomitte.viewCommiteeMember(adminName);
	}
	@GetMapping("/getallMembers")
	public List<AdmissionCommiteeMember> getAllMember() {
		return admincomitte.viewAllCommiteeMembers();		
	}
	
	@DeleteMapping("/deleteMember/{memberId}")
    public void deleteMemberByadminId(@PathVariable int memberId)
    {
		admincomitte.removeCommiteeMember(memberId);
    } 
	@GetMapping("/findById")
	public AdmissionCommiteeMember findById(int adminId) {
		return admincomitte.findByAdminId(adminId);		
	}
	
}




