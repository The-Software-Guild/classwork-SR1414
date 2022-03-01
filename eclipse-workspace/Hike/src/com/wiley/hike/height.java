package com.wiley.hike;

public class height {
	
	int feet;
	int inches;
	
	public height(int feet, int inches) {
		
		this.feet = feet;
		this.inches = inches;
		while (inches > 12) {
			feet++;
			inches = inches - 12;
		}
		
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
		System.out.println("Hello");
	}
	
}
