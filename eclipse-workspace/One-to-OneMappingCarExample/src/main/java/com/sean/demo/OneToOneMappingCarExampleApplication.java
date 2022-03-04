package com.sean.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sean.entity.Car;
import com.sean.entity.Person;
import com.sean.persistence.CarDao;
import com.sean.persistence.PersonDao;

@SpringBootApplication(scanBasePackages = "com.sean")
@EntityScan(basePackages = "com.sean.entity")
@EnableJpaRepositories(basePackages = "com.sean.persistence")
public class OneToOneMappingCarExampleApplication implements CommandLineRunner {

	@Autowired
	private PersonDao personDao;
	@Autowired
	private CarDao carDao;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingCarExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Car c1=new Car("C001","Audi", "A3");
		Car c2=new Car("C002","Porsche", "Cayenne");
		Car c3=new Car("C003","Honda", "Civic");
		Car c4=new Car("C004","Toyota", "Corolla");
		
		
		Person p1=new Person("P001","Person 1");
		p1.setCar(c4);
		Person p2=new Person("P002","Person 2");
		p2.setCar(c3);
		Person p3=new Person("P003","Person 3");
		p3.setCar(c2);
		Person p4=new Person("P004","Person 4");
		p4.setCar(c1);
		
		
		carDao.save(c1);
		carDao.save(c2);
		carDao.save(c3);
		carDao.save(c4);
		
		personDao.save(p1);
		personDao.save(p2);
		personDao.save(p3);
		personDao.save(p4);
		
		System.out.println("Tables created and data stored");*/
		System.out.println("==========================");
		Person person=personDao.getById("P002");
		System.out.println(person);
		System.out.println("============================");
		
		
	}

}
