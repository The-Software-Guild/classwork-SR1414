package Course;

public class Course {

	String courseName;
	int courseFee;
	CourseTime courseType;
	CourseDelivery courseDelivery;

	enum CourseDelivery {
		CLASSROOM, ONLINE
	}

	enum CourseTime {
		PARTTIME, FULLTIME
	}
	
	

	public Course(String courseName, int courseFee, CourseTime courseType, CourseDelivery courseDelivery) {
		super();
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.courseType = courseType;
		this.courseDelivery = courseDelivery;
	}


	public Course(String courseName, int courseFee, int courseType, int courseDelivery) {
		super();
		this.courseName = courseName;
		this.courseFee = courseFee;
		
		switch (courseType) {
		case 1: 
			this.courseType = CourseTime.PARTTIME;
			break;
		case 2:
			this.courseType = CourseTime.FULLTIME;
			break;
		}
		
		switch (courseDelivery) {
		case 1: 
			this.courseDelivery = CourseDelivery.CLASSROOM;
			break;
		case 2:
			this.courseDelivery = CourseDelivery.ONLINE;
			break;
		}
		
	}
	

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	public CourseTime getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseTime courseType) {
		this.courseType = courseType;
	}

	public CourseDelivery getCourseDelivery() {
		return courseDelivery;
	}

	public void setCourseDelivery(CourseDelivery courseDelivery) {
		this.courseDelivery = courseDelivery;
	}

}
