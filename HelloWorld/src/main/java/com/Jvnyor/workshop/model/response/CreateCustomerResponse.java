package com.Jvnyor.workshop.model.response;

import java.util.Date;

import lombok.Data;

@Data
public class CreateCustomerResponse {
	
	private long id;
	private long docId;
	private String message;
	private Date createdAt;

}
