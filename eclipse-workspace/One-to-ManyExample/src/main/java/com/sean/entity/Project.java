package com.sean.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ProjectJPA")
public class Project {

	@Id
	private String projectId;
	private String projectName;
	
	public Project(String projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	@OneToMany
	List<Employee> empList=new ArrayList<Employee>();
	
}