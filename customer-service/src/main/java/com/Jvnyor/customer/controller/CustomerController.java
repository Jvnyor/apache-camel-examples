package com.Jvnyor.customer.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jvnyor.customer.model.Customer;
import com.Jvnyor.customer.model.CustomerResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customer/api/v1")
@Slf4j
public class CustomerController {
	
	
	@PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponse> create(@RequestBody Customer customer) {
		
		long leftLimit = 1L;
	    long rightLimit = 100L;
	    long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
		
        CustomerResponse response = new CustomerResponse();
        response.setCreatedAt(new Date());
        response.setId(generatedLong);
        response.setDocId(customer.getDocId());
        response.setMessage("Customer created with success!");
        log.info("CustomerResponse: {}",response);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
