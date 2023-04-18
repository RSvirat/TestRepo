package com.school.data.read.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.data.read.service.entity.RegisterEntity;
import com.school.data.read.service.repository.RegisterRepo;
import com.school.data.read.service.service.RegisterService;

@RestController
@RequestMapping("/schooldataread")
public class RegisterController {

	@Autowired
	RegisterRepo registerRepo;
	
	@GetMapping("/getStudentRegisters")
	public List<RegisterEntity> getStudentRegisters() {
		return registerRepo.findList();
	}
	
}
