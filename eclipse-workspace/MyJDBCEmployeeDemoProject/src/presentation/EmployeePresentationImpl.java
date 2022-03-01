package presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;



//jdbc:mysql://127.0.0.1:3306/?user=root
public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService = new EmployeeServiceImpl();
	

	@Override
	public void showMenu() {
		System.out.println("===============================");
		System.out.println("1. Show Employees ");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Insert New Employee ");
		System.out.println("4. Delete Employee");
		System.out.println("5. Update Employee Salary");
		System.out.println("6. See Department");
		System.out.println("7. Exit");
		System.out.println("==============================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			List<Employee> employeeList = employeeService.getAllEmployee();
			System.out.println("Employee List");
			for (Employee employee : employeeList) {
				System.out.println(employee);
			}
			break;

		case 2:
			System.out.println("Enter Employee ID : ");
			int id = scanner.nextInt();
			Employee searchedEmployee = employeeService.getEmployeeById(id);
			if (searchedEmployee != null)
				System.out.println(searchedEmployee);
			else
				System.out.println("Employee with ID " + id + " does not exist!");
			break;
		case 3:
			Employee emp = new Employee();

			System.out.println("Enter Employee ID : ");
			emp.setEmpId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			emp.setEmpName(scanner.next());
			System.out.println("Enter Employee Designation : ");
			emp.setEmpDesignation(scanner.next());
			System.out.println("Enter Employee Department : ");
			emp.setEmpDepartment(scanner.next());
			System.out.println("Enter Employee Salary : ");
			emp.setEmpSalary(scanner.nextInt());

			if (employeeService.saveEmployee(emp))
				System.out.println("Employee Saved Successfully!");
			else
				System.out.println("Employee Insertion Failed!");
			break;
		case 4:
			System.out.println("Enter Employee ID : ");
			int removeId = scanner.nextInt();
			employeeService.removeEmployeeById(removeId);
			System.out.println("Deleted Employee");
		case 5:
			System.out.println("Enter Employee ID : ");
			int updateId = scanner.nextInt();
			System.out.println("Enter New Salary : ");
			int updateSalary = scanner.nextInt();
			employeeService.updateSalaryById(updateId, updateSalary);
		case 6:
			ArrayList<String> departments = new ArrayList<String>();
			
			departments = employeeService.getDepartments();
			System.out.println("===============================");
			int count = 1;
			for (int i = 0; i < departments.size(); i++) {
				System.out.println(count + ". Show " + departments.get(i));
				count++;
			}
			String getDepartment = departments.get(scanner.nextInt() - 1);
			
			ArrayList<Employee> empsInDepartment = new ArrayList<Employee>();
			
			empsInDepartment = (ArrayList<Employee>) employeeService.getEmpInDepartment(getDepartment);
			for (Employee employee : empsInDepartment) {
				System.out.println(employee);
			}
			
			
			System.out.println("==============================");
		case 7:
			System.out.println("Thanks for using Employee Management System!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
