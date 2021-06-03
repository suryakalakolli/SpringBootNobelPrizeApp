package com.prizes.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prizes.model.Prize;


public interface NobelPrizeRepository extends JpaRepository<Prize,Integer>{

	List<Prize> findByYearAndCategory(String year, String category); 
	
	List<Prize> findByCategoryOrderByYearAsc(String firstname); 

	String findAByYear(String firstname);
	
}
