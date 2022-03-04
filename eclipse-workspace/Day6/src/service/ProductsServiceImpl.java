package service;

import java.util.ArrayList;

import Entity.Products;
import persistence.ProductsDao;
import persistence.ProductsDaoImpl;

public class ProductsServiceImpl implements ProductsService {
	
	//private ProductsDao productsDao = new ProductsDaoImpl();
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

}
