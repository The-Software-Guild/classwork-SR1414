package service;

import java.util.ArrayList;
import java.util.List;

import entity.Employee;
import persistence.EmployeeDao;
import persistence.EmployeeDaoImpl;



public class EmployeeServiceImpl implements EmployeeService {

	//private EmployeeDao employeeDao=new EmployeeDaoImpl();
	private EmployeeDao employeeDao;
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getEmployeeList();
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		int rows=employeeDao.insertRecord(employee);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeDao.getRecordById(id);
	}

	@Override
	public String removeEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.removeById(id);
		
		
	}

	@Override
	public String updateSalaryById(int id, int salary) {
		// TODO Auto-generated method stub
		return employeeDao.updateSalaryById(id, salary);
	}

	@Override
	public ArrayList<String> getDepartments() {
		// TODO Auto-generated method stub
		return employeeDao.getDepartments();
	}

	@Override
	public List<Employee> getEmpInDepartment(String department) {
		// TODO Auto-generated method stub
		return employeeDao.getEmpInDepartment(department);
	}


}
