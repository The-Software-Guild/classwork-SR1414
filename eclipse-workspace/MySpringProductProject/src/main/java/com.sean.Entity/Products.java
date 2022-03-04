package com.sean.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public @Data @NoArgsConstructor @AllArgsConstructor class Products {
	private int id;
	private String code;
	private String name;
	private String description;
	private double price;
}
