package com.employee.service;

import com.employee.bean.Employee;

public interface IAdminStaffService {
	public String login(int id,String password);
	
//	public String updateEmpAttendance(String e, int empId);

	public int calculateLOP(Employee e, int empId, float empSalary);

}
