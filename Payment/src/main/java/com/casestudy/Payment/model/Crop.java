package com.casestudy.Payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Crop")
public class Crop {

	@Id
	private String id;
	private String crop_name;
	private String crop_type;
	private String crop_quantity;
	private String uploaded_by;
	private String price;

	
	public Crop(String id, String crop_name, String crop_type, String crop_quantity,
			 String uploaded_by, String price) {
		super();
		this.id = id;
		this.crop_name = crop_name;
		this.crop_type = crop_type;
		this.crop_quantity = crop_quantity;
		this.uploaded_by = uploaded_by;
		this.price=price;
	}

	// List<location> loc = new ArrayList<>();

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUploaded_by() {
		return uploaded_by;
	}

	public void setUploaded_by(String uploaded_by) {
		this.uploaded_by = uploaded_by;
	}

	public Crop(String id, String crop_name, String crop_type, String crop_quantity) {
		super();
		this.id = id;
		this.crop_name = crop_name;
		this.crop_type = crop_type;
		this.crop_quantity = crop_quantity;
		
	}

	public String getCrop_quantity() {
		return crop_quantity;
	}

	public void setCrop_quantity(String crop_quantity) {
		this.crop_quantity = crop_quantity;
	}

	

	public Crop() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCrop_name() {
		return crop_name;
	}

	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}

	public String getCrop_type() {
		return crop_type;
	}

	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}

}