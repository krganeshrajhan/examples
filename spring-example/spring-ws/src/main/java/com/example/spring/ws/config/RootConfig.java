package com.example.spring.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
@ComponentScan("com.concretepage")
public class RootConfig extends WsConfigurerAdapter {

	@Bean(name = "students")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema studentsSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("StudentsPort");
		wsdl11Definition.setLocationUri("/soapws");
		wsdl11Definition.setTargetNamespace("http://concretepage.com/soap");
		wsdl11Definition.setSchema(studentsSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema studentsSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/students.xsd"));
	}

	@Bean(name = "penaltyRaifAM")
	public Wsdl11Definition penaltyRaifAMServiceDefinition(XsdSchema penaltyRaifAMServiceSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("PenaltyRaifAMService");
		wsdl11Definition.setLocationUri("/soapws");
		wsdl11Definition.setTargetNamespace("http://com/emc/drcap/penalty/model/bc/am/common/");
		wsdl11Definition.setSchema(penaltyRaifAMServiceSchema);
		/*SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/PenaltyRaifAMService.wsdl"));*/
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema penaltyRaifAMServiceSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/PenaltyRaifAMService.xsd"));
	}
}
