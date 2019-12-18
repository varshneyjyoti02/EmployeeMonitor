package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.service.IAdminStaffService;

@RestController
public class AdminStaffController {

	@Autowired
	IAdminStaffService AdminStaffService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/login/{id}/{password}")
	public String login(@PathVariable int id, @PathVariable String password) {
		return AdminStaffService.login(id, password);
	}
	/*
	 * @RequestMapping(method=RequestMethod.PUT, value="/updateAttendance/{e}/{id}")
	 * public String updateEmpAttendance( @PathVariable String e, @PathVariable int
	 * empId) { return AdminStaffService.updateEmpAttendance(e, empId) ;
	 * 
	 * }
	 */
	
	
}
