package Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		boolean run = true;
		String empName;
		int empId;
		// Course[] courseList = new Course[8];
		ArrayList<Course> courseList = new ArrayList<Course>();
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		courseList.add(new Course("Java", 250, 1, 2));
		courseList.add(new Course("Python", 500, 2, 2));
		courseList.add(new Course("JavaScript", 1000, 1, 1));
		courseList.add(new Course("C+", 250, 2, 2));
		courseList.add(new Course("DevOps", 300, 2, 2));
		courseList.add(new Course("Web Apps", 200, 1, 1));
		courseList.add(new Course("Production Support", 250, 1, 2));
		courseList.add(new Course("Sensitivity Training", 600, 2, 1));

		while (run == true) {
			
			System.out.println("-----------------------------------\n");
			System.out.println("Select an option for Courses\n");
			System.out.println(" 1 - Register Employee for Course");
			System.out.println(" 2 - Deregister Employee from Course");
			System.out.println(" 3 - List Employees in Course");
			System.out.println("-----------------------------------\n");

			int userSelect = userInput.nextInt();
			
			System.out.println("\n");
			switch (userSelect) {

			case 1:
				Scanner input = new Scanner(System.in);
				System.out.println("-----------------------------------");
				System.out.println("Register Employee");
				System.out.println("-----------------------------------\n");

				System.out.print("Enter Employee ID : \n");
				
				empId = input.nextInt();
				
				System.out.println("");
				System.out.print("Enter Name : \n");
				System.out.println("");
				
				empName = input.nextLine();
				input.nextLine();
				System.out.println("\n");
				
				System.out.println("Select Course : \n");
				for (int i = 0; i < courseList.size(); i++) {
					System.out.println(i + 1 + " - " + courseList.get(i).getCourseName() + " - £"
							+ courseList.get(i).getCourseFee() + " - " + courseList.get(i).getCourseType() + " - "
							+ courseList.get(i).getCourseDelivery());
				}

				userSelect = userInput.nextInt();
				
				while (userSelect < 1 || userSelect > courseList.size()) {
					System.out.println("ERROR: invalid input, please enter the number for the course : ");
					userSelect = userInput.nextInt() - 1;
				}

				Employee e1 = new Employee(empId, empName, courseList.get(userSelect).getCourseName(),
						courseList.get(userSelect).getCourseFee(), courseList.get(userSelect).getCourseType(),
						courseList.get(userSelect).getCourseDelivery());
				employeeList.add(e1);
				System.out.println(employeeList.get(0).getEmpId());
				System.out.println(employeeList.get(0).getName());
				System.out.println(employeeList.get(0).getCourseName());
				System.out.println(employeeList.get(0).getCourseFee());
				System.out.println(employeeList.get(0).getCourseType());
				System.out.println(employeeList.get(0).getCourseDelivery());

				;

				break;

			case 2:
				System.out.println("-----------------------------------");
				System.out.println("Select Employee to remove : ");
				System.out.println("-----------------------------------\n");

				break;

			case 3:
				System.out.println("-----------------------------------");
				System.out.println("Select Course to view : ");
				System.out.println("-----------------------------------\n");
				

				for (int i = 0; i < courseList.size(); i++) {
					System.out.println(i + 1 + " - " + courseList.get(i).getCourseName() + " - £"
							+ courseList.get(i).getCourseFee() + " - " + courseList.get(i).getCourseType() + " - "
							+ courseList.get(i).getCourseDelivery());
				}
				
				userSelect = userInput.nextInt();
				
				while (userSelect < 0 || userSelect > courseList.size()) {
					System.out.println("ERROR: invalid input, please enter the number for the course : ");
					userSelect = userInput.nextInt() - 1;
				}
				
				for (int i = 0; i < employeeList.size(); i++) {
					System.out.println(employeeList.get(0).getName());
					if ((courseList.get(userSelect - 1).getCourseName()).equals(employeeList.get(i).courseName) ) {
						System.out.println(employeeList.get(i).getEmpId() + " - " + employeeList.get(i).getName());
						
					}
					
				}
				
				

				break;

			default:
				System.out.println("Error: Invalid Selection");
				break;

			}

		}

	}
}
