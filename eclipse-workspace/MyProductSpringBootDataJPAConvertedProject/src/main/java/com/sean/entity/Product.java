package com.sean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
	
	@Id private int prodId;
	
	@Column(name = "code")
	private String prodCode;
	
	@Column(name = "name")
	private String prodName;
	
	@Column(name = "description")
	private String prodDescription;
	
	@Column(name = "price")
	private double prodPrice;
}
