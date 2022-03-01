package persistence;

import java.util.ArrayList;

import Entity.Products;

public interface ProductsDao {
	
	ArrayList<Products> getProductsList();

}
