package com.cropdeal.DealerService.model;

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
@Document(collection = "Crop")
public class Crop {

	@Id
	private String id;
	private String crop_name;
	private String crop_type;
	private String crop_quantity;
	//private location location;
	private String uploaded_by;

	
	

	

}