package com.sean.presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sean.entity.Product;
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
	
	

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("===============================");
		System.out.println("1. Show Products ");
		System.out.println("2. Search Products by ID ");
		System.out.println("3. Add New Product ");
		System.out.println("4. Delete Product ");
		System.out.println("5. Delete Product by Name");
		System.out.println("6. Update Product Price");
		System.out.println("==============================");

	}

	@Override
	public void performMenu(int choice) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		switch (choice) {

		case 1:
			ArrayList<Product> productsList = productsService.getProductsList();
			System.out.println("Products List");

			for (Product products : productsList) {
				System.out.println(products);
			}
			break;
		case 2:
			System.out.println("Enter Product ID : ");
			int id = scanner.nextInt();
			Product product = productsService.getById(id);
			if (product.getProdCode() == null) {
				System.out.println("product does not exist");
			} else {
				System.out.println(product);
			}

			break;
		case 3:
			Product newProduct = new Product();

			System.out.println("Enter Product ID :");
			newProduct.setProdId(scanner.nextInt());
			System.out.println("Enter Product Code :");
			newProduct.setProdCode(scanner.next());
			System.out.println("Enter Product Name :");
			newProduct.setProdName(scanner.next());
			System.out.println("Enter Product Description :");
			newProduct.setProdDescription(scanner.next());
			System.out.println("Enter Product price :");
			newProduct.setProdPrice(scanner.nextDouble());

			// productsService.addNewProduct(newProduct)
			if (productsService.saveProduct(newProduct))
				System.out.println("Product Saved Successfully!");
			else
				System.out.println("Product Insertion Failed!");
			break;
		case 4:
			System.out.println("Enter ID of product to delete : ");
			int deleteProdId = scanner.nextInt();

			if (productsService.deleteProduct(deleteProdId)) {
				System.out.println("Product Deleted Successfully");
			}
			else {
				System.out.println("Product Delete failed");
			}
			break;
		case 5:
			System.out.println("Enter name of product to delete : ");
			String deleteProdName = scanner.next();
			if (productsService.deleteProductByName(deleteProdName)) {
				System.out.println("Product Deleted Successfully");
			}
			else {
				System.out.println("Product Delete failed");
			}
			break;
			
		case 6:
			System.out.println("Enter Product ID : ");
			int pId = scanner.nextInt();
			System.out.println("===============================");
			System.out.println("1. CODE ");
			System.out.println("2. NAME ");
			System.out.println("3. DESCRIPTION ");
			System.out.println("4. PRICE ");
			System.out.println("==============================");
			System.out.println("What property of product to edit : ");
			int select = scanner.nextInt();
			
			
			if (select == 1) {
				System.out.println("Enter new code : ");
				String pCode = scanner.next();
				
				if (productsService.updateProductCodeById(pId, pCode))
					System.out.println("Product code updated successfully");
				else
					System.out.println("Product code update failed");
			}
			if (select == 2) {
				System.out.println("Enter new name : ");
				String pName = scanner.next();
				
				if (productsService.updateProductNameById(pId, pName))
					System.out.println("Product name updated successfully");
				else
					System.out.println("Product name update failed");
			}
			if (select == 3) {
				System.out.println("Enter new description : ");
				String pDescription = scanner.next();
				
				if (productsService.updateProductDescriptionById(pId, pDescription))
					System.out.println("Product description updated successfully");
				else
					System.out.println("Product description update failed");
			}
			
			if (select == 4) {
				System.out.println("Enter new price : ");
				double pPrice = scanner.nextDouble();
				
				if (productsService.updateProductPriceById(pId, pPrice))
					System.out.println("Product price updated successfully");
				else
					System.out.println("Product price update failed");
			}
			break;
			
			
			
			
			
				
			/*case 5:
			HashMap<Integer, String> property = new HashMap<Integer, String>();
			Product editProd = new Product();
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
				editProd.setProdId(scanner.nextInt());
			}else if (select == 2) {
				System.out.println("Enter new product CODE : ");
				editProd.setProdCode(scanner.next());
			}else if (select == 3) {
				System.out.println("Enter new product NAME : ");
				editProd.setProdName(scanner.next());
			}else if (select == 4) {
				System.out.println("Enter new product DESCRIPTION : ");
				editProd.setProdDescription(scanner.next());
			}else if (select == 5) {
				System.out.println("Enter new product PRICE : ");
				editProd.setProdPrice(scanner.nextDouble());
			}
			
			System.out.println(productsService.updateProduct(editProd, updateId));
			break;*/
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
