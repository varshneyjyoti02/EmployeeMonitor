package com.employee.service;

import java.util.Optional;

import com.employee.bean.Employee;

public interface IAdminService {
	public String login(int id, String password);

	public Employee addEmpDetails(Employee e);

	public void deleteEmpDetails(int id);

	public Optional<Employee> viewEmpDetails(int id);

}
