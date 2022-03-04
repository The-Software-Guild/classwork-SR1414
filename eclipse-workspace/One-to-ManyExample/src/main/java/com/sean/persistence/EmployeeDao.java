package com.sean.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sean.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}