package com.sean.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sean.entity.Product;
import com.sean.persistence.ProductsDao;
import com.sean.presentation.ProductsPresentation;

@SpringBootApplication(scanBasePackages = "com.sean")
@EntityScan(basePackages = "com.sean.entity")
@EnableJpaRepositories(basePackages = "com.sean.persistence")
public class MyProductSpringBootDataJpaConvertedProjectApplication implements CommandLineRunner {

	@Autowired
	private ProductsPresentation productsPresentation;
	@Autowired
	private ProductsDao productsDao;
	
	public static void main(String[] args) {
		SpringApplication.run(MyProductSpringBootDataJpaConvertedProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		
		List<Product> prodList = productsDao.getAllProductsGreaterThan100();
		for (Product product : prodList) {
			System.out.println(product.toString());
			
		}
		while (true) {
			productsPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			productsPresentation.performMenu(choice);
		}
		
	}

}
