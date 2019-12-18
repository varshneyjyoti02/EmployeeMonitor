package com.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.bean.Employee;
import com.employee.service.IAdminService;

@RestController
public class AdminController {
	@Autowired
	IAdminService adminService;

	@RequestMapping(method = RequestMethod.GET, value = "/login/{id}/{password}")
	public String login(@PathVariable int id, @PathVariable String password) {
		return adminService.login(id, password);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/view/{id}")
	public Optional<Employee> viewEmpDetails(@PathVariable int id) {
		return adminService.viewEmpDetails(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void deleteEmpDetails(@PathVariable int id) {
		adminService.deleteEmpDetails(id);

	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public Employee add(@RequestBody Employee e) {
		return adminService.addEmpDetails(e);
	}
}
