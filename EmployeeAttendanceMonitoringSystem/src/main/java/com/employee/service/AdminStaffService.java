package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.bean.Admin;
import com.employee.bean.Employee;
import com.employee.dao.IAdminDAO;
import com.employee.dao.IAdminStaffDao;
import com.employee.dao.IEmployeeDAO;

@Service
public class AdminStaffService implements IAdminStaffService {
	
    @Autowired
    IAdminStaffDao AdminStaffDao;
	
	@Autowired
	IEmployeeDAO EmployeeDAO;
	
	Employee employee;


	@Override
	public String login(int id, String password) {
		if (AdminStaffDao.findById(id)!=null) {
			System.out.println("Login Successful");
			return "Login successful.";
		}
		return null;
	}
	
	/*
	 * @Override public String updateEmpAttendance(String e, int empId) { if
	 * (AdminStaffDao.findById(empId)!=null) { if(e=="Present") {
	 * employee.setPresentCount(employee.getPresentCount()+1); } else
	 * if(e=="Absent") { employee.setAbsentCount(employee.getAbsentCount()+1); }
	 * 
	 * } return null; }
	 */
	@Override
	public int calculateLOP(Employee e, int empId, float empSalary) {
		// TODO Auto-generated method stub
		return 0;
	}

}
