package service;

import java.util.ArrayList;

import Entity.Products;

public interface ProductsService {
	
	ArrayList<Products> getProductsList();
	
	Products getById(int id);
	
	boolean saveProduct(Products product);
	
	String deleteProduct(int id);
	
	String updateProduct(Products product, int id);

}
