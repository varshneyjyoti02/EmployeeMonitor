package com.employee.service;

public interface IEmployeeService{
	public String login(String userName, String password);

	public String viewEmpAttendance(int empId);

	public String viewEmpLOP(int empId);

	public String applyLeave(int empId);

}
