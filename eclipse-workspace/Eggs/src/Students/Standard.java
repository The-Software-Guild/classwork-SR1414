package Students;

import java.util.Arrays;

public class Standard {

	Student[] studentList = new Student[8];
	Student[] sortedList = new Student[8];

	public Standard(Student[] studentList) {

		this.studentList = studentList;
	}

	public Student[] getStudentList() {
		return studentList;
	}

	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}

	public int sortByRollNo() {
		
	}

	// public static Student[] sortByOverallGrade() {

	// }

	// public static Student[] sortByMaths() {

	// }

}
