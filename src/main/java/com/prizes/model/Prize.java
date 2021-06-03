package com.prizes.model;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "prizes")

public class Prize {

	@Id
	@GeneratedValue
	private String year;

	private String category;
	private String overallMotivation;


	public String getOverallMotivation() {
		return overallMotivation;
	}

	public void setOverallMotivation(String overallMotivation) {
		this.overallMotivation = overallMotivation;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
}
