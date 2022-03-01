package com.wiley.workplace.demo;

public class Worker {
	String name;
	int salaryRate;
	int perMonth;
	int perWeek;
	int perDay;
	int hours;

	public Worker(String name, int salaryRate) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
		this.perMonth = salaryRate / 12;
		this.perDay = perMonth / 4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(int salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	public void getWeeklyPay () {
		int weeklyPay = (salaryRate / 12) / 4;
		System.out.println(weeklyPay);
		
	}

}
