package com.example.spring.remoting;

import com.example.spring.remoting.config.RootConfig;
import com.example.spring.remoting.model.StateCapitalServiceIF;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Demonstrates how Spring bean can be used without any HTTP involvement.
 */
public class MainServiceAppContext
{
	public static void printStateInfo(
			final StateCapitalServiceIF stateCapitalMapper,
			final String state)
	{
		System.out.println(
				"The capital of " + state + " is "
						+ stateCapitalMapper.getCapital(state));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		/*final ApplicationContext context =
				new FileSystemXmlApplicationContext(
						"C:\\Workspace\\examples\\spring-example\\spring-remoting\\spring-remoting-server\\src\\main\\webapp\\WEB-INF\\context\\spring-http-config.xml" );*/
		final ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		StateCapitalServiceIF stateCapitalMapper =
				(StateCapitalServiceIF) context.getBean("stateCapitalService");
		printStateInfo(stateCapitalMapper, "Alabama");
		printStateInfo(stateCapitalMapper, "Colorado");
	}
}
