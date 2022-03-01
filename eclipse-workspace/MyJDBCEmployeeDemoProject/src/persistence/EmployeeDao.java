package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Employee;


public interface EmployeeDao {

	List<Employee> getEmployeeList();
	int insertRecord(Employee employee);
	Employee getRecordById(int id);
	String removeById(int id);
	String updateSalaryById(int id, int salary);
	ArrayList<String> getDepartments();
	List<Employee> getEmpInDepartment(String department);
}
