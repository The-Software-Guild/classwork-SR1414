package com.sean.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sean.Entity.Products;

public class ProductRowMapper implements RowMapper<Products> {
	
	@Override
	public Products mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int pid=resultSet.getInt("PRODID");
		String code=resultSet.getString("CODE");
		String name=resultSet.getString("NAME");
		String description=resultSet.getString("DESCRIPTION");
		double price=resultSet.getInt("PRICE");

		Products products=new Products(pid, code, name, description, price);
		return products;
	}

}
