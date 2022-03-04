package service;

import java.util.ArrayList;
import java.util.List;

import entity.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployee();

	boolean saveEmployee(Employee employee);

	Employee getEmployeeById(int id);
	
	String removeEmployeeById(int id);
	
	String updateSalaryById(int id, int salary);
	
	ArrayList<String> getDepartments();
	
	List<Employee> getEmpInDepartment(String department);
}
