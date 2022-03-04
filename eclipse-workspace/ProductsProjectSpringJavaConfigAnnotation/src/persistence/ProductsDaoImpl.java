package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import Entity.Products;


@Component("prodDao")
public class ProductsDaoImpl implements ProductsDao {

	Connection connection = null;

	@Override
	public ArrayList<Products> getProductsList() {

		ArrayList<Products> productsList = new ArrayList<Products>();

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

	@Override
	public Products getById(int id) {
		// TODO Auto-generated method stub

		Products product = new Products();
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCT WHERE prodId = ?");
			preparedStatement.setInt(1, id);
			// to execure all dql statements : executeQUery()
			ResultSet resultSet = preparedStatement.executeQuery();
//			3.Process Result
			while (resultSet.next()) {
				int prodId = resultSet.getInt("PRODID");
				String code = resultSet.getString("CODE");
				String name = resultSet.getString("NAME");
				String description = resultSet.getString("DESCRIPTION");
				double price = resultSet.getInt("PRICE");

				product = new Products(prodId, code, name, description, price);

			}

			return product;

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
		return null;
	}

	@Override
	public int addNewProduct(Products product) {
		// TODO Auto-generated method stub

		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO product VALUES (?,?,?,?,?)");
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getCode());
			preparedStatement.setString(3, product.getName());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setDouble(5, product.getPrice());
			int rows = preparedStatement.executeUpdate();

//		3.Process Result

			return rows;
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
		return 0;
	}

	@Override
	public String deleteProduct(int id) {
		Connection connection = null;
		String str1 = "Deleted Product";
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");
//			2. Query
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM PRODUCT WHERE PRODID=?");
			preparedStatement.setInt(1, id);

			// to execure all dql statements : executeQUery()
			preparedStatement.executeUpdate();
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
		return str1;
	}

	@Override
	public String updateProduct(Products product, int id) {
		// TODO Auto-generated method stub
		String i = "Updated Employee Salary";
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc173", "root", "test123");

//			2. Query
			PreparedStatement preparedStatement = connection
					.prepareStatement("UPDATE product SET PRODID = ?, CODE = ?, NAME = ?, DESCRIPTION = ?, PRICE = ? WHERE PRODID = ?;");
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getCode());
			preparedStatement.setString(3, product.getName());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setDouble(5, product.getPrice());
			preparedStatement.setInt(6, id);
			preparedStatement.executeUpdate();
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

		return i;
	}

}
