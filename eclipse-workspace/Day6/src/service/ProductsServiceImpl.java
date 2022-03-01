package service;

import java.util.ArrayList;

import Entity.Products;
import persistence.ProductsDao;
import persistence.ProductsDaoImpl;

public class ProductsServiceImpl implements ProductsService {
	
	private ProductsDao productsDao = new ProductsDaoImpl();

	@Override
	public ArrayList<Products> getProductsList() {
		// TODO Auto-generated method stub
		return productsDao.getProductsList();
	}

}
