
package com.sean.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.sean.entity.Product;

@Repository
public interface ProductsDao extends JpaRepository<Product, Integer>{
	
	
	
	@Transactional
	@Modifying
	@Query("Update Product set prodCode=:code where prodId=:id")
	int updateProductCodeById(@Param("id") int prodId,@Param("code") String code);
	
	@Transactional
	@Modifying
	@Query("Update Product set prodName=:name where prodId=:id")
	int updateProductNameById(@Param("id") int prodId,@Param("name") String name);
	
	@Transactional
	@Modifying
	@Query("Update Product set prodDescription=:description where prodId=:id")
	int updateProductDescriptionById(@Param("id") int prodId,@Param("description") String description);
	
	@Transactional
	@Modifying
	@Query("Update Product set prodPrice=:price where prodId=:id")
	int updateProductPriceById(@Param("id") int prodId,@Param("price") double price);
	
	@Transactional
	@Modifying
	@Query("FROM Product where prodPrice > 100")
	List<Product> getAllProductsGreaterThan100();
	
	@Transactional
	@Modifying
	@Query("Delete Product where prodId=:id")
	int deleteProductById(@Param("id") int id);
	
	@Transactional
	@Modifying
	@Query("Delete Product where prodName=:name")
	int deleteProductByName(@Param("name") String name);
}
