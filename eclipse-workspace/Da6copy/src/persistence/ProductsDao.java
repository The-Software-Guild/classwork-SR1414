package persistence;

import java.util.ArrayList;

import Entity.Products;

public interface ProductsDao {
	
	ArrayList<Products> getProductsList();
	
	Products getById(int id);
	
	int addNewProduct(Products product);
	
	String deleteProduct(int id);
	
	String updateProduct(Products product, int id);

}
