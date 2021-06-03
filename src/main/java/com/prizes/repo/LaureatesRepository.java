package com.prizes.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.prizes.model.Laureates;

public interface LaureatesRepository extends JpaRepository<Laureates,Integer>{

	
	List<Laureates> findAllByOrderByFirstnameAsc(); 
	
	List<Laureates> findByFirstname(String firstname);
	

	
	}
