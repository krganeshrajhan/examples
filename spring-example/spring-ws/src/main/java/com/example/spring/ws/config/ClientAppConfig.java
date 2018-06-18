package com.example.spring.ws.config;

import com.example.spring.ws.client.PenaltyRaifAMClient;
import com.example.spring.ws.client.StudentClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class ClientAppConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.concretepage.soap");
//		marshaller.setContextPath("com.emc.drcap.penalty.model.bc.am.common");
		return marshaller;
	}
	@Bean
	public StudentClient studentClient(Jaxb2Marshaller marshaller) {
		StudentClient client = new StudentClient();
		client.setDefaultUri("http://localhost:9999/spring4soap/soapws/students.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Bean
	public PenaltyRaifAMClient penaltyRaifAMClient(Jaxb2Marshaller marshaller) {

		PenaltyRaifAMClient penaltyRaifAMClient = new PenaltyRaifAMClient();
		penaltyRaifAMClient.setDefaultUri("http://localhost:9999/spring4soap/soapws/penaltyRaifAM.wsdl");
		penaltyRaifAMClient.setMarshaller(marshaller);
		penaltyRaifAMClient.setUnmarshaller(marshaller);
		return penaltyRaifAMClient;
	}

	@Bean
	public WebServiceTemplate webServiceTemplate() {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		webServiceTemplate.setMarshaller(marshaller());
		webServiceTemplate.setUnmarshaller(marshaller());
		webServiceTemplate.setDefaultUri("http://localhost:9999/spring4soap/soapws/penaltyRaifAM.wsdl");
		return webServiceTemplate;
	}
}
