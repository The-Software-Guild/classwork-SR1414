package com.sean.service;

import java.util.ArrayList;

import com.sean.entity.Product;

public interface ProductsService {
	
	ArrayList<Product> getProductsList();
	
	Product getById(int id);
	
	boolean saveProduct(Product product);
	
	boolean deleteProduct(int id);
	
	boolean updateProductPriceById(int id, double price);
	
	boolean updateProductCodeById(int id, String code);
	
	boolean updateProductNameById(int id, String name);
	
	boolean updateProductDescriptionById(int id, String description);

	boolean deleteProductByName(String name);

}
