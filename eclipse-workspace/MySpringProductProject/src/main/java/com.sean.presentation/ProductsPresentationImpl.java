package com.sean.presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sean.Entity.Products;
import com.sean.service.ProductsService;
import com.sean.service.ProductsServiceImpl;


@Component("prodPresentation")
public class ProductsPresentationImpl implements ProductsPresentation {

	// private ProductsService productsService = new ProductsServiceImpl();
	
	@Autowired
	@Qualifier("productsServiceImpl")
	private ProductsService productsService;
	
	public void setProductsService(ProductsService productsService) {
		this.productsService = productsService;
	}
	

	public ProductsPresentationImpl() {
		super();
		this.productsService = productsService;
	}
	

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("===============================");
		System.out.println("1. Show Products ");
		System.out.println("2. Search Products by ID ");
		System.out.println("3. Add New Product ");
		System.out.println("4. Delete Product ");
		System.out.println("5. Update Product");
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
		case 2:
			System.out.println("Enter Product ID : ");
			int id = scanner.nextInt();
			Products product = productsService.getById(id);
			if (product.getCode() == null) {
				System.out.println("product does not exist");
			} else {
				System.out.println(product);
			}

			break;
		case 3:
			Products newProduct = new Products();

			System.out.println("Enter Product ID :");
			newProduct.setId(scanner.nextInt());
			System.out.println("Enter Product Code :");
			newProduct.setCode(scanner.next());
			System.out.println("Enter Product Name :");
			newProduct.setName(scanner.next());
			System.out.println("Enter Product Description :");
			newProduct.setDescription(scanner.next());
			System.out.println("Enter Product price :");
			newProduct.setPrice(scanner.nextDouble());

			// productsService.addNewProduct(newProduct)
			if (productsService.saveProduct(newProduct))
				System.out.println("Product Saved Successfully!");
			else
				System.out.println("Product Insertion Failed!");
			break;
		case 4:
			System.out.println("Enter ID of product to delete : ");
			int deleteProdId = scanner.nextInt();

			System.out.println(productsService.deleteProduct(deleteProdId));
			break;
		case 5:
			HashMap<Integer, String> property = new HashMap<Integer, String>();
			Products editProd = new Products();
			property.put(1, "ID");
			property.put(2, "CODE");
			property.put(3, "NAME");
			property.put(4, "DESCRIPTION");
			property.put(5, "PRICE");

			System.out.println("Enter ID of product to update : ");
			int updateId = scanner.nextInt();
			editProd = productsService.getById(updateId);
			
			System.out.println("===============================");
			System.out.println("1. ID ");
			System.out.println("2. CODE ");
			System.out.println("3. NAME ");
			System.out.println("4. DESCRIPTION ");
			System.out.println("5. PRICE");
			System.out.println("==============================");
			System.out.println("Select property to update : ");
			int select = scanner.nextInt();
			if (select == 1) {
				System.out.println("Enter new product ID : ");
				editProd.setId(scanner.nextInt());
			}else if (select == 2) {
				System.out.println("Enter new product CODE : ");
				editProd.setCode(scanner.next());
			}else if (select == 3) {
				System.out.println("Enter new product NAME : ");
				editProd.setName(scanner.next());
			}else if (select == 4) {
				System.out.println("Enter new product DESCRIPTION : ");
				editProd.setDescription(scanner.next());
			}else if (select == 5) {
				System.out.println("Enter new product PRICE : ");
				editProd.setPrice(scanner.nextDouble());
			}
			
			System.out.println(productsService.updateProduct(editProd, updateId));
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
