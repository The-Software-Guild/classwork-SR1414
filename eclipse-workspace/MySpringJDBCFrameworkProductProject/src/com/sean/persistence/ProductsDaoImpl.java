package com.sean.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sean.Entity.Products;
import com.sean.util.ProductRowMapper;


//@Component("prodDao")
@Repository
public class ProductsDaoImpl implements ProductsDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ArrayList<Products> getProductsList() {

		ArrayList<Products> productsList = new ArrayList<Products>();
		String query = "SELECT * FROM PRODUCT";
		productsList = (ArrayList<Products>) jdbcTemplate.query(query, new ProductRowMapper());
		return productsList;
	}

	@Override
	public Products getById(int id) {
		// TODO Auto-generated method stub

		String query = "SELECT * FROM PRODUCT WHERE PRODID=?";
		Products product = jdbcTemplate.queryForObject(query, new ProductRowMapper(), id);
		return product;
		
		
	}

	@Override
	public int addNewProduct(Products product) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO PRODUCT VALUES(?,?,?,?,?)";

		int rows = jdbcTemplate.update(query, product.getId(), product.getCode(), product.getName(),
				product.getDescription(), product.getPrice());

		return rows;
	}

	@Override
	public String deleteProduct(int id) {
		String str1 = "Deleted Product";
		
		String query = "DELETE FROM PRODUCT WHERE PRODID=?";
		
		int row  = jdbcTemplate.update(query, id);

		
		return str1;
	}

	@Override
	public String updateProduct(Products product, int id) {
		// TODO Auto-generated method stub
		String i = "Updated Employee Salary";
		
		String query = "UPDATE product SET PRODID = ?, CODE = ?, NAME = ?, DESCRIPTION = ?, PRICE = ? WHERE PRODID = ?;";
		
		int rows = jdbcTemplate.update(query, product.getId(), product.getCode(), product.getName(),
				product.getDescription(), product.getPrice(), id);

		return i;
	}

}
