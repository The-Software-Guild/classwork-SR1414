package com.sean.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sean.Entity.Products;
import com.sean.persistence.ProductsDao;
import com.sean.persistence.ProductsDaoImpl;


//@Component
@Service
public class ProductsServiceImpl implements ProductsService {
	
	//private ProductsDao productsDao = new ProductsDaoImpl();
	@Autowired
	private ProductsDao productsDao;
	
	
	public ProductsServiceImpl(ProductsDao productsDao) {
		super();
		this.productsDao = productsDao;
	}
	
	

	public ProductsDao getProductsDao() {
		return productsDao;
	}



	@Override
	public ArrayList<Products> getProductsList() {
		// TODO Auto-generated method stub
		return productsDao.getProductsList();
	}



	@Override
	public Products getById(int id) {
		// TODO Auto-generated method stub
		return productsDao.getById(id);
	}



	@Override
	public boolean saveProduct(Products product) {
		// TODO Auto-generated method stub
		int rows =  productsDao.addNewProduct(product);
		if(rows>0)
			return true;
		return false;
	}



	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return productsDao.deleteProduct(id);
	}



	@Override
	public String updateProduct(Products product, int id) {
		// TODO Auto-generated method stub
		return productsDao.updateProduct(product, id);
	}

}
