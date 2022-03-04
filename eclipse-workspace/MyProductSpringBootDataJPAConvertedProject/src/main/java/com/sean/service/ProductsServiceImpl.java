
package com.sean.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sean.entity.Product;
import com.sean.persistence.ProductsDao;


//@Component
@Service
public class ProductsServiceImpl implements ProductsService{

	
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
	public ArrayList<Product> getProductsList() {
		// TODO Auto-generated method stub
		return (ArrayList<Product>) productsDao.findAll();
	}
	
	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return productsDao.getById(id);
	}
	
	@Override
	public boolean saveProduct(Product product) {
		// TODO Auto-generated method stub
		Product prod=productsDao.save(product);
		if(prod!=null)
			return true;
		return false;
	}
	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		
		int rows = productsDao.deleteProductById(id);
		if(rows>0)
			return true;
		return false;
		
	}
	
	@Override
	public boolean updateProductCodeById(int id, String code) {
		// TODO Auto-generated method stub
		int rows = productsDao.updateProductCodeById(id, code);
		if(rows>0)
			return true;
		return false;
	}
	
	@Override
	public boolean updateProductNameById(int id, String name) {
		// TODO Auto-generated method stub
		int rows = productsDao.updateProductNameById(id, name);
		if(rows>0)
			return true;
		return false;
	}
	
	@Override
	public boolean updateProductDescriptionById(int id, String description) {
		// TODO Auto-generated method stub
		int rows = productsDao.updateProductDescriptionById(id, description);
		if(rows>0)
			return true;
		return false;
	}
	
	@Override
	public boolean updateProductPriceById(int id, double price) {
		// TODO Auto-generated method stub
		int rows = productsDao.updateProductPriceById(id, price);
		if(rows>0)
			return true;
		return false;
	}
	
	@Override
	public boolean deleteProductByName(String name) {
		// TODO Auto-generated method stub
		int rows = productsDao.deleteProductByName(name);
		if(rows>0)
			return true;
		return false;
	}



}
