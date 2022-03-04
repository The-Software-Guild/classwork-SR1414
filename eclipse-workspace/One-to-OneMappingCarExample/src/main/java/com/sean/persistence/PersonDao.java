package com.sean.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sean.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, String> {

}