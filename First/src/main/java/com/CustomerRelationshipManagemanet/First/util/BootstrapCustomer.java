package com.CustomerRelationshipManagemanet.First.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.CustomerRelationshipManagemanet.First.repository.CustomerRepository;

@Component
public class BootstrapCustomer {
	
	private final CustomerRepository customerRepository;
	
	
	public BootstrapCustomer(CustomerRepository customerRepository) {
		this.customerRepository =customerRepository;
	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void onApplicationReady(ApplicationReadyEvent event) {
//		for (int i =0; i<=100;i++) {
//			String name = faker.name().firstName();
//			Customer customer = Customer
//										.builder()
//										.name(name)
//										.email(name+"@"+faker.internet()
//										.domainName())
//										.age(faker.number(.numberBetween(18,34))
//										.build();
		}

