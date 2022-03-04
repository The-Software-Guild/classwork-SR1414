package com.sean.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sean.entity.Husband;
import com.sean.entity.Wife;
import com.sean.persistence.HusbandDao;
import com.sean.persistence.WifeDao;

@SpringBootApplication(scanBasePackages = "com.sean")
@EntityScan(basePackages = "com.sean.entity")
@EnableJpaRepositories(basePackages = "com.sean.persistence")
public class OneToOneMappingApplication implements CommandLineRunner {

	@Autowired
	private WifeDao wifeDao;
	@Autowired
	private HusbandDao husbandDao;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Husband h1=new Husband("H001","Husband 1");
		Husband h2=new Husband("H002","Husband 2");
		Husband h3=new Husband("H003","Husband 3");
		Husband h4=new Husband("H004","Husband 4");
		
		
		Wife w1=new Wife("W001","Wife 1");
		w1.setHusband(h4);
		Wife w2=new Wife("W002","Wife 2");
		w2.setHusband(h3);
		Wife w3=new Wife("W003","Wife 3");
		w3.setHusband(h2);
		Wife w4=new Wife("W004","Wife 4");
		w4.setHusband(h1);
		
		
		husbandDao.save(h1);
		husbandDao.save(h2);
		husbandDao.save(h3);
		husbandDao.save(h4);
		
		wifeDao.save(w1);
	wifeDao.save(w2);
		wifeDao.save(w3);
		wifeDao.save(w4);
		
		System.out.println("Tables created and data stored");*/
		System.out.println("==========================");
		Wife wife=wifeDao.getById("W002");
		System.out.println(wife);
		System.out.println("============================");
		
		
	}

}