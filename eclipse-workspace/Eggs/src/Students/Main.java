package Students;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Student[] studentList = new Student[8];
		studentList[0] = new Student(6, "John Smith", 75, 50, 25);
		studentList[1] = new Student(5, "Jane Smith", 24, 65, 87);
		studentList[2] = new Student(1, "Joe Shmoe", 34, 45, 65);
		studentList[3] = new Student(3, "Aaron A Aaronson", 34, 52, 76);
		studentList[4] = new Student(4, "Nick Person", 76, 24, 54);
		studentList[5] = new Student(2, "Guy Manning", 45, 65, 23);
		studentList[6] = new Student(7, "Sarah Evens", 54, 76, 87);
		studentList[7] = new Student(0, "Smith Johnny", 87, 87, 45);
		Standard standardisedList = new Standard(studentList);
		//System.out.println(studentList[0].getRollNo());
		
		
	}
}
