package com.sean.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Person {
	
	public Person(String personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	
	@Id private String personId;
	
	private String personName;
	
	@OneToOne private Car car;

}
