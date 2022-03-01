package EmployeeException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		String empName;
		int empAge;
		
		boolean run = true;
		
		
		while (run == true) {
			System.out.println("------------------------------------");
			System.out.println("Enter your name");
			empName = userInput.nextLine();

			System.out.println("Enter your age");
			empAge = userInput.nextInt();
			System.out.println("------------------------------------");
			
			if (employeeList.contains(empName)) {
				throw new DuplicateEntryException("Already Existing Entry Under That Name");
			}
			else if (empAge < 18 && empAge > 60) {
				throw new InvalidAgeException("Employee must be between the ages 18 and 60");
			}
			
		}
		
		
		

	}
}
