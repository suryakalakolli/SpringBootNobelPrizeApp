
package com.prizes.model;

import java.util.List;

import javax.persistence.*;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "nobel")
//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Nobel{
	//private static final long serialVersionUID = 1L;
   @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@OneToMany(targetEntity=Laureates.class)
	List<Laureates> laureates;
	@OneToMany(targetEntity=Prize.class)
	List<Prize> prizes;
	public List<Laureates> getLaureates() {
		return laureates;
	}
	public void setLaureates(List<Laureates> laureates) {
		this.laureates = laureates;
	}
	public List<Prize> getPrize() {
		return prizes;
	}
	public void setPrize(List<Prize> prize) {
		this.prizes = prize;
	}
}
