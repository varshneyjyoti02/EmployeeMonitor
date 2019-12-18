package com.employee.bean;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private String empPassword;
	private float empSalary;
	private float empLOP;
	private int leaveApplied;
	private int leaveAllowed;
	private int absentCount;
	private int presentCount;
	private int noOfWorkingDays;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public float getEmpLOP() {
		return empLOP;
	}
	public void setEmpLOP(float empLOP) {
		this.empLOP = empLOP;
	}
	public int getLeaveApplied() {
		return leaveApplied;
	}
	public void setLeaveApplied(int leaveApplied) {
		this.leaveApplied = leaveApplied;
	}
	public int getLeaveAllowed() {
		return leaveAllowed;
	}
	public void setLeaveAllowed(int leaveAllowed) {
		this.leaveAllowed = leaveAllowed;
	}
	public int getAbsentCount() {
		return absentCount;
	}
	public void setAbsentCount(int absentCount) {
		this.absentCount = absentCount;
	}
	public int getPresentCount() {
		return presentCount;
	}
	public void setPresentCount(int presentCount) {
		this.presentCount = presentCount;
	}
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + absentCount;
		result = prime * result + empId;
		result = prime * result + Float.floatToIntBits(empLOP);
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empPassword == null) ? 0 : empPassword.hashCode());
		result = prime * result + Float.floatToIntBits(empSalary);
		result = prime * result + leaveAllowed;
		result = prime * result + leaveApplied;
		result = prime * result + noOfWorkingDays;
		result = prime * result + presentCount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (absentCount != other.absentCount)
			return false;
		if (empId != other.empId)
			return false;
		if (Float.floatToIntBits(empLOP) != Float.floatToIntBits(other.empLOP))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empPassword == null) {
			if (other.empPassword != null)
				return false;
		} else if (!empPassword.equals(other.empPassword))
			return false;
		if (Float.floatToIntBits(empSalary) != Float.floatToIntBits(other.empSalary))
			return false;
		if (leaveAllowed != other.leaveAllowed)
			return false;
		if (leaveApplied != other.leaveApplied)
			return false;
		if (noOfWorkingDays != other.noOfWorkingDays)
			return false;
		if (presentCount != other.presentCount)
			return false;
		return true;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empPassword, float empSalary, float empLOP, int leaveApplied,
			int leaveAllowed, int absentCount, int presentCount, int noOfWorkingDays) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPassword = empPassword;
		this.empSalary = empSalary;
		this.empLOP = empLOP;
		this.leaveApplied = leaveApplied;
		this.leaveAllowed = leaveAllowed;
		this.absentCount = absentCount;
		this.presentCount = presentCount;
		this.noOfWorkingDays = noOfWorkingDays;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPassword=" + empPassword + ", empSalary="
				+ empSalary + ", empLOP=" + empLOP + ", leaveApplied=" + leaveApplied + ", leaveAllowed=" + leaveAllowed
				+ ", absentCount=" + absentCount + ", presentCount=" + presentCount + ", noOfWorkingDays="
				+ noOfWorkingDays + "]";
	}
	
	

	}