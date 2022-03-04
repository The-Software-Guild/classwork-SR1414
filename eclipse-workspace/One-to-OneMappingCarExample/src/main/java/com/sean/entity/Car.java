package com.sean.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
	
	@Id private String carId;
	
	private String carBrand;
	
	private String carModel;
	
	

}
