package com.example.spring.remoting;

import com.example.spring.remoting.config.RootConfig;
import com.example.spring.remoting.model.StateCapitalServiceIF;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * This class demonstrates a client of a Spring HTTP-exposed service and shows
 * how the client interacts with the server as if using normal Java objects
 * rather than using anything HTTP specific.
 */
public class HttpClient
{
	public static void printStateInfo(
			final StateCapitalServiceIF stateCapitalMapper,
			final String state)
	{
		System.out.println(
				"The capital of " + state + " is "
						+ stateCapitalMapper.getCapital(state));
	}

	public static void main(final String[] arguments)
	{
		/*final ApplicationContext context =
				new FileSystemXmlApplicationContext(
						"C:\\Workspace\\examples\\spring-example\\spring-remoting\\spring-remoting-server\\src\\main\\webapp\\WEB-INF\\context\\spring-http-client-config.xml");*/
		final ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		final StateCapitalServiceIF stateCapitalService =
				(StateCapitalServiceIF) context.getBean("stateCapitalProxyService");
		printStateInfo(stateCapitalService, "Colorado");
		printStateInfo(stateCapitalService, "Alabama");
	}
}
