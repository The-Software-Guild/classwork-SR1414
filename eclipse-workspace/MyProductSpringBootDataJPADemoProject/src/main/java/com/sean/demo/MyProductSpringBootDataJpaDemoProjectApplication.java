package com.sean.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sean.entity.Product;
import com.sean.persistence.ProductDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sean.entity")
@EnableJpaRepositories(basePackages = "com.sean.persistence")
public class MyProductSpringBootDataJpaDemoProjectApplication implements CommandLineRunner {

	@Autowired
	private ProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(MyProductSpringBootDataJpaDemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> prodList = productDao.findAll();
		for (Product product : prodList) {
			System.out.println(product);
		}
	}

}
