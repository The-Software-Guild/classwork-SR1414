package com.sean.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sean.entity.Husband;

@Repository
public interface HusbandDao extends JpaRepository<Husband, String> {

}