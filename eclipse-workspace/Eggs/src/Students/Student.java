package Students;

public class Student {
	
	int rollNo;
	String studName;
	int marksInEng;
	int marksInMaths;
	int marksInScience;
	
	public Student(int rollNo, String studName, int marksInEng, int marksInMaths, int marksInScience) {
		
		this.rollNo = rollNo;
		this.studName = studName;
		this.marksInEng = marksInEng;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getMarksInEng() {
		return marksInEng;
	}
	public void setMarksInEng(int marksInEng) {
		this.marksInEng = marksInEng;
	}
	public int getMarksInMaths() {
		return marksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		this.marksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return marksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		this.marksInScience = marksInScience;
	}
	
	
}
