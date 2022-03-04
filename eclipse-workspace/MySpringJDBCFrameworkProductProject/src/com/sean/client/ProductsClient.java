package com.sean.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sean.presentation.ProductsPresentation;
import com.sean.presentation.ProductsPresentationImpl;


public class ProductsClient {
public static void main(String[] args) {
	
	ApplicationContext springContainer = new AnnotationConfigApplicationContext(ProductConfig.class);
	ProductsPresentation productsPresentation = (ProductsPresentation)springContainer.getBean("prodPresentation");
	
	
	Scanner scanner = new Scanner(System.in);
	while (true) {
		productsPresentation.showMenu();
		System.out.println("Enter Choice : ");
		int choice = scanner.nextInt();
		productsPresentation.performMenu(choice);
		
	}
}
}
