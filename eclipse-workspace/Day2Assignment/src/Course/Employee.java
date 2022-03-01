package Course;

public class Employee extends Course {
	
	int empId;
	String name;

	


	public Employee(int empId, String name, String courseName, int courseFee, CourseTime courseType, CourseDelivery courseDelivery) {
		super(courseName, courseFee, courseType, courseDelivery);
		// TODO Auto-generated constructor stub
	}


	public Employee(String courseName, int courseFee, int courseType, int courseDelivery) {
		super(courseName, courseFee, courseType, courseDelivery);
		// TODO Auto-generated constructor stub
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
