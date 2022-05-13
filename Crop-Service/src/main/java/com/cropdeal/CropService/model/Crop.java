package com.cropdeal.CropService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@Document(collection = "Crop")
public class Crop {

	@Id
	private String id;
	
	@Field("crop_name")
	private String crop_name;
	private String crop_type;
	private String crop_quantity;
	private location location;
	private String uploaded_by;
	private String price;

	
	
}