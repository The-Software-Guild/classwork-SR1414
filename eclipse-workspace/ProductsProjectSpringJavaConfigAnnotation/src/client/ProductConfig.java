package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import persistence.ProductsDao;
import persistence.ProductsDaoImpl;
import presentation.ProductsPresentationImpl;
import service.ProductsServiceImpl;
import service.ModifiedProductsServiceImpl;

@Configuration
public class ProductConfig {

	@Bean("prodDao")
	public ProductsDaoImpl getProductsDao() {
		return new ProductsDaoImpl();

	}

	@Bean
	public ProductsServiceImpl prodService() {

		return new ProductsServiceImpl(getProductsDao());

	}

	@Bean

	public ModifiedProductsServiceImpl modifiedProdService() {
		return new ModifiedProductsServiceImpl(getProductsDao());

	}

	@Bean
	public ProductsPresentationImpl prodPresentation() {

		ProductsPresentationImpl productsPresentationImpl = new ProductsPresentationImpl();
		productsPresentationImpl.setProductsService(prodService());
		return productsPresentationImpl;

	}

}
