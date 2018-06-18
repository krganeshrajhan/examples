package com.example.spring.remoting.config;

import java.util.HashMap;

import com.example.spring.remoting.model.StateCapitalServiceIF;
import com.example.spring.remoting.service.CabBookingService;
import com.example.spring.remoting.service.CabBookingServiceImpl;
import com.example.spring.remoting.service.StateCapitalService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
@ComponentScan(basePackages = {"com.example.spring.remoting.service"})
public class RootConfig {

	@Bean(name = "/booking")
	HttpInvokerServiceExporter accountService() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService( new CabBookingServiceImpl() );
		exporter.setServiceInterface( CabBookingService.class );
		return exporter;
	}

	@Bean(name = "/statesCapitals")
	HttpInvokerServiceExporter statesCapitals() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(new StateCapitalService());
		exporter.setServiceInterface(StateCapitalServiceIF.class);
		return exporter;
	}

	@Bean
	public StateCapitalServiceIF stateCapitalService() {
		StateCapitalService stateCapitalService = new StateCapitalService();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Alabama","Montgomery");
		stateCapitalService.setStatesAndCapitals(map);
		return stateCapitalService;
	}

	@Bean
	public HttpInvokerProxyFactoryBean stateCapitalProxyService() {
		HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
		invoker.setServiceUrl("http://localhost:9999/SpringHTTPExample/statesCapitals");
		invoker.setServiceInterface(StateCapitalServiceIF.class);
		return invoker;
	}

}
