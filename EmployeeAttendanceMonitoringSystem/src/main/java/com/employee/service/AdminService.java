package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.bean.Admin;
import com.employee.bean.Employee;
import com.employee.dao.IAdminDAO;
import com.employee.dao.IEmployeeDAO;

@Service
public class AdminService implements IAdminService {

	@Autowired
	IAdminDAO AdminDAO;
	@Autowired
	IEmployeeDAO EmployeeDAO;



	@Override
	public String login(int id, String password) {
		if (AdminDAO.findById(id)!=null) {
			System.out.println("Login Successful");
			return "Login successful.";
		}
		return null;
	}

	@Override
	public Optional<Employee> viewEmpDetails(int id) {
		if (EmployeeDAO.findById(id) != null) {
			return EmployeeDAO.findById(id);
		}
		return null;
	}

	@Override
	public Employee addEmpDetails(Employee e) {

		return EmployeeDAO.save(e);
	}

	@Override
	public void deleteEmpDetails(int id) {
		// TODO Auto-generated method stub
		if (EmployeeDAO.findById(id) != null) {
			EmployeeDAO.deleteById(id);
		}

	}

}
