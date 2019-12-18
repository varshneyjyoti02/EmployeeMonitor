package com.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.bean.Admin;

public interface IAdminStaffDao extends JpaRepository<Admin, Integer>{

}
