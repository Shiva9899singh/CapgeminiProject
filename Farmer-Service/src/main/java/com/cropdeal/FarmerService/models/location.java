package com.cropdeal.FarmerService.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class location {
	private String street;
	private String village;
	private String city;
	private String state;
	private String pincode;

	
}
