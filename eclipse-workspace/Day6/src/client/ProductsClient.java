package client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import presentation.ProductsPresentation;
import presentation.ProductsPresentationImpl;

public class ProductsClient {
	public static void main(String[] args) {
		// ProductsPresentation productsPresentation = new ProductsPresentationImpl();

		ApplicationContext springContainer = new ClassPathXmlApplicationContext("client/products.xml");
		ProductsPresentation productsPresentation = (ProductsPresentation) springContainer.getBean("prodPresentation");

		Scanner scanner = new Scanner(System.in);
		while (true) {
			productsPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			productsPresentation.performMenu(choice);

		}
	}
}
