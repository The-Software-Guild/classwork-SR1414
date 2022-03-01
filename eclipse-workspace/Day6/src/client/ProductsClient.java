package client;

import java.util.Scanner;

import presentation.ProductsPresentation;
import presentation.ProductsPresentationImpl;


public class ProductsClient {
public static void main(String[] args) {
	ProductsPresentation productsPresentation = new ProductsPresentationImpl();
	Scanner scanner = new Scanner(System.in);
	while (true) {
		productsPresentation.showMenu();
		System.out.println("Enter Choice : ");
		int choice = scanner.nextInt();
		productsPresentation.performMenu(choice);
		
	}
}
}
