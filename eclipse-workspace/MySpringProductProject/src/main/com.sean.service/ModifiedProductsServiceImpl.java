package com.sean.service;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

import com.sean.Entity.Products;
import com.sean.persistence.ProductsDao;
import com.sean.persistence.ProductsDaoImpl;


@Component
public class ModifiedProductsServiceImpl extends ProductsServiceImpl{

	
	public ModifiedProductsServiceImpl(ProductsDao productsDao) {
		super(productsDao);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public ArrayList<Products> getProductsList() {
		// TODO Auto-generated method stub
		return getProductsDao().getProductsList();
	}
	
	@Override
	public Products getById(int id) {
		// TODO Auto-generated method stub
		return getProductsDao().getById(id);
	}
	
	@Override
	public boolean saveProduct(Products product) {
		// TODO Auto-generated method stub
		int rows = getProductsDao().addNewProduct(product);
		if(rows>0)
			return true;
		return false;
	}
	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return getProductsDao().deleteProduct(id);
	}
	public String updateProduct(Products product, int id) {
		// TODO Auto-generated method stub
		return getProductsDao().updateProduct(product, id);
	}

}
