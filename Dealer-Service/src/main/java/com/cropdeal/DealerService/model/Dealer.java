package com.cropdeal.DealerService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Dealer")
public class Dealer {

	@Id
	private String id;
	private String dealer_name;
	private String dealer_email;
	private String dealer_contactNo;
	private String password;
//	private Dealer_Subcribed_Crop dealer_Subscribed_Crop;
	private bankDetails bank_detail;
	//private Invoice_receipt invoice;
	//private Payment_Method payment_method;

	
}
