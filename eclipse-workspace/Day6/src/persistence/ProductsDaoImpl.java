package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.Products;

public class ProductsDaoImpl implements ProductsDao {

	@Override
	public ArrayList<Products> getProductsList() {

		ArrayList<Products> productsList = new ArrayList<Products>();
		Connection connection = null;
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCT");
			// to execure all dql statements : executeQUery()
			ResultSet resultSet = preparedStatement.executeQuery();
//			3.Process Result
			while (resultSet.next()) {
				int id = resultSet.getInt("PRODID");
				String code = resultSet.getString("CODE");
				String name = resultSet.getString("NAME");
				String description = resultSet.getString("DESCRIPTION");
				double price = resultSet.getInt("PRICE");

				Products products = new Products(id, code, name, description, price);

				productsList.add(products);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return productsList;
	}

}
