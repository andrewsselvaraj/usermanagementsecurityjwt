package com.bezkoder.springjwt.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "loggertab")
public class LoggerInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public String getMssages() {
		return mssages;
	}



	public void setMssages(String mssages) {
		this.mssages = mssages;
	}

	@NotBlank
	@Size(max = 20)
	private String mssages;



	public LoggerInfo() {

	}

 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	 
}