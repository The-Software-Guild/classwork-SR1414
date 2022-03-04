package com.sean.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sean.persistence.ProductsDao;
import com.sean.persistence.ProductsDaoImpl;
import com.sean.presentation.ProductsPresentationImpl;
import com.sean.service.ModifiedProductsServiceImpl;
import com.sean.service.ProductsServiceImpl;

@Configuration
//@ComponentScan(basePackages = {"persistence", "service", "presentation"})
@ComponentScan(basePackages = "com.sean")
public class ProductConfig {


}
