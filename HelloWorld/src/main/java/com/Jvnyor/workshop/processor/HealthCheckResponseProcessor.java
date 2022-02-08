package com.Jvnyor.workshop.processor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.Jvnyor.workshop.model.response.HealthCheckResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class HealthCheckResponseProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		HealthCheckResponse response = new HealthCheckResponse();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		response.setMessage("HealthCheck Executado com sucesso !!!");
		response.setTimestamp(sdf.format(new Date()));
		
		log.info("Component: {}", exchange.getContext().getComponentNames());
		exchange.getMessage().setBody(response);
	}

}
