package com.prizes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prizes.model.Laureates;
import com.prizes.model.Nobel;
import com.prizes.model.Prize;
import com.prizes.repo.LaureatesRepository;
import com.prizes.repo.NobelPrizeRepository;
import com.prizes.repo.NobelRepository;
import com.prizes.service.PrizeService;
@Service
public class PrizeServiceImpl implements PrizeService {
	@Autowired
	private LaureatesRepository laureatesRepository;
	@Autowired
	private NobelPrizeRepository nobelPrizeRepository;
	@Autowired
	private NobelRepository nobelRepository;


//set details
	@Override
	public List<Nobel> savePrizes(List<Nobel> entities) {
		entities= nobelRepository.saveAll(entities);
		return entities;
	}
 //3
	@Override
	public List<Prize> getWinnerByYearAndCategory(String year,String category) {
	List<Prize> yearCat = nobelPrizeRepository.findByYearAndCategory(year,category );
	if(yearCat != null) {
			return yearCat;
	}
		return null;
	}
//1
	@Override
	public List<Laureates> getWinners(String name) {

	List<Laureates> listOfPrizes = laureatesRepository.findByFirstname(name);
	if(listOfPrizes != null && !listOfPrizes.isEmpty()) {
		return listOfPrizes;
	}
	return null;
	
	}
	@Override
	public String getYear(String name) {
		
		return nobelPrizeRepository.findAByYear(name);
		
	}
	
//4
	@Override
	public List<Prize> getAllPrizes(String year) {
		return nobelPrizeRepository.findByCategoryOrderByYearAsc(year);
	}

}
