package com.sean.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sean.presentation.ProductsPresentation;

@SpringBootApplication(scanBasePackages = "com.sean")
public class MySpringBootProductProjectApplication implements CommandLineRunner{

	@Autowired
	private ProductsPresentation productsPresentation;
	
	public static void main(String[] args) {
		/*ApplicationContext springContainer = */SpringApplication.run(MySpringBootProductProjectApplication.class, args);
		/*EmployeePresentation employeePresentation = (EmployeePresentation) springContainer.getBean("empPresentation");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			employeePresentation.performMenu(choice);
		}*/
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			productsPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			productsPresentation.performMenu(choice);
		}
		
	}

}