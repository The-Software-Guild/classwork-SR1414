package com.sean.service;

import java.util.ArrayList;

import com.sean.Entity.Products;

public interface ProductsService {
	
	ArrayList<Products> getProductsList();
	
	Products getById(int id);
	
	boolean saveProduct(Products product);
	
	String deleteProduct(int id);
	
	String updateProduct(Products product, int id);

}
