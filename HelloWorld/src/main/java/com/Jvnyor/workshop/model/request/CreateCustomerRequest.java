package com.Jvnyor.workshop.model.request;

import lombok.Data;

@Data
public class CreateCustomerRequest {
	
	private long docId;
	private String customerName;

}
