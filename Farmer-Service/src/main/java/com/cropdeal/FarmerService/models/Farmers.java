package com.cropdeal.FarmerService.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "Farmers")
public class Farmers {

	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String id;
	private String farmer_name;
	private String farmeremail;
	private String farmer_contactNo;
	private location farmer_address;
	private bankDetails bank_details;
	private String password;
	


	

}