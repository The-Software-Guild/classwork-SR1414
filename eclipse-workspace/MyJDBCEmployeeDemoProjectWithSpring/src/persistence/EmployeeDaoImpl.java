package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Employee;

/*
 * JDBC
 * 1. Connect to DB 
 * 		1.1 Register Driver
 * 		1.2 Connect to DataBase
 * 2. Query
 * 3. Process The result
 * 4. Close the connection
 */
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<String> getDepartments() {
		ArrayList<String> departments = new ArrayList<String>();
		ArrayList<String> test = new ArrayList<String>();
		Connection connection = null;

		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("select distinct department from employee;");
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				//System.out.println(resultSet.getString("Department"));
				departments.add(resultSet.getString("Department"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return departments;
	}
	
	@Override
	public List<Employee> getEmpInDepartment(String department) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		Connection connection = null;
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where department = '" + department + "';");
			// to execure all dql statements : executeQUery()
			ResultSet resultSet = preparedStatement.executeQuery();

//			3.Process Result
			while (resultSet.next()) {
				int id = resultSet.getInt("EMPID");
				String name = resultSet.getString("EMPNAME");
				String desig = resultSet.getString("DESIGNATION");
				String deptt = resultSet.getString("DEPARTMENT");
				int sal = resultSet.getInt("SALARY");

				Employee employee = new Employee(id, name, desig, deptt, sal);

				employeeList.add(employee);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeeList() {

		List<Employee> employeeList = new ArrayList<Employee>();
		Connection connection = null;
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");
			// to execure all dql statements : executeQUery()
			ResultSet resultSet = preparedStatement.executeQuery();

//			3.Process Result
			while (resultSet.next()) {
				int id = resultSet.getInt("EMPID");
				String name = resultSet.getString("EMPNAME");
				String desig = resultSet.getString("DESIGNATION");
				String deptt = resultSet.getString("DEPARTMENT");
				int sal = resultSet.getInt("SALARY");

				Employee employee = new Employee(id, name, desig, deptt, sal);

				employeeList.add(employee);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employeeList;
	}

	@Override
	public int insertRecord(Employee employee) {
		Connection connection = null;
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getEmpDesignation());
			preparedStatement.setString(4, employee.getEmpDepartment());
			preparedStatement.setInt(5, employee.getEmpSalary());

			// to execure all dml statements(insert, delete,update) : executeUpdate()
			int rows = preparedStatement.executeUpdate();

//			3.Process Result

			return rows;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public String updateSalaryById(int id, int salary) {
		Connection connection = null;
		String i = "Updated Employee Salary";
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection
					.prepareStatement("UPDATE employee SET SALARY = " + salary + " WHERE empID = " + id + ";");
			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return i;
	}

	public String removeById(int id) {
		Employee employee = null;
		Connection connection = null;
		String str1 = "Deleted Employee";
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");
//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPID=?");
			preparedStatement.setInt(1, id);

			// to execure all dql statements : executeQUery()
			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return str1;
		}

	}

	@Override
	public Employee getRecordById(int id) {
		Employee employee = null;
		Connection connection = null;
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMPID=?");
			preparedStatement.setInt(1, id);

			// to execure all dql statements : executeQUery()
			ResultSet resultSet = preparedStatement.executeQuery();

//			3.Process Result
			if (resultSet.next()) {
				int eid = resultSet.getInt("EMPID");
				String name = resultSet.getString("EMPNAME");
				String desig = resultSet.getString("DESIGNATION");
				String deptt = resultSet.getString("DEPARTMENT");
				int sal = resultSet.getInt("SALARY");

				employee = new Employee(eid, name, desig, deptt, sal);

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return employee;
	}

	

	// @Override
	// public int insertRecord(entity.Employee employee) {
	// TODO Auto-generated method stub
	// return 0;
	// }

	// @Override
	// public entity.Employee getRecordById(int id) {
	// TODO Auto-generated method stub
	// return null;
	// }

}
