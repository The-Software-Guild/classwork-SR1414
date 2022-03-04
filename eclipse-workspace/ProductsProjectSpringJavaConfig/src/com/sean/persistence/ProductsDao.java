package com.sean.persistence;

import java.util.ArrayList;

import com.sean.Entity.Products;

public interface ProductsDao {
	
	ArrayList<Products> getProductsList();
	
	Products getById(int id);
	
	int addNewProduct(Products product);
	
	String deleteProduct(int id);
	
	String updateProduct(Products product, int id);

}
