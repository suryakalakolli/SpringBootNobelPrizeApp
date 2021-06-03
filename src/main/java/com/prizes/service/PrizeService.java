package com.prizes.service;

import java.util.List;

import com.prizes.model.Laureates;
import com.prizes.model.Nobel;
import com.prizes.model.Prize;

public interface PrizeService {
	
	  List<Nobel> savePrizes(List<Nobel> entities);
	   //3
	  List<Prize> getWinnerByYearAndCategory(String year,String category);
	  //1
	  List<Laureates> getWinners(String name);
	  //4
	  List<Prize> getAllPrizes(String year);
//2
	String getYear(String name);
	  
	
}
