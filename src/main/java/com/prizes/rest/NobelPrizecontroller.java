package com.prizes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prizes.model.Laureates;
import com.prizes.model.Nobel;
import com.prizes.model.Prize;

import com.prizes.serviceImpl.PrizeServiceImpl;
@RestController
@RequestMapping("/prize")
public class NobelPrizecontroller {
@Autowired
private PrizeServiceImpl service;
	//save
@PostMapping("/create")
public ResponseEntity<String> savePrizes(@RequestBody List<Nobel> entities){
	 service.savePrizes(entities);
	return ResponseEntity.ok("rizes saved succesfully");
}

//4
@GetMapping("/all/{year}")
public  ResponseEntity<List<Prize>> getAllPrizes(@PathVariable String year) {
List<Prize> prizes = service.getAllPrizes(year);

	return ResponseEntity.ok(prizes);
}
//3
@GetMapping("/two/{firstname}/{categeory}")
public ResponseEntity<List<Prize>> getTwoPrizes(@PathVariable String firstname,@PathVariable String category ){
	
	List<Prize> prize = service.getWinnerByYearAndCategory(firstname, category);
	return ResponseEntity.ok(prize);
	
}
//1
@GetMapping("/one/{firstname}")
public ResponseEntity<List<Laureates>> getOnePrizes(@PathVariable String firstname ){
	
	List<Laureates> prize = service.getWinners(firstname);
	return ResponseEntity.ok(prize);
	
}
//2
@GetMapping("/{firstname}")
public ResponseEntity<String> getOnePrize(@PathVariable String firstname ){
	
	String prize = service.getYear(firstname);
	return ResponseEntity.ok(prize);
	
}



}


	
	 
    
    
    
    
    
    
    


	 























































