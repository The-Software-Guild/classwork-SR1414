package presentation;

import java.util.ArrayList;
import java.util.Scanner;

import Entity.Products;
import service.ProductsService;
import service.ProductsServiceImpl;

public class ProductsPresentationImpl implements ProductsPresentation {

	private ProductsService productsService = new ProductsServiceImpl();

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("===============================");
		System.out.println("1. Show Products ");
		System.out.println("==============================");

	}

	@Override
	public void performMenu(int choice) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		switch (choice) {

		case 1:
			ArrayList<Products> productsList = productsService.getProductsList();
			System.out.println("Products List");
			
			for (Products products : productsList) {
				System.out.println(products);
			}
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
