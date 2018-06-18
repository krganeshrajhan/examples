package com.example.spring.ws.main;

import com.concretepage.soap.GetStudentResponse;
import com.emc.drcap.penalty.model.bc.am.common.ApproveStatusResponse;
import com.example.spring.ws.client.PenaltyRaifAMClient;
import com.example.spring.ws.client.StudentClient;
import com.example.spring.ws.config.ClientAppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSoapClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ClientAppConfig.class);
		ctx.refresh();

		/*PenaltyRaifAMService_Service penaltyRaifAMService_service = new PenaltyRaifAMService_Service(url);
		PenaltyRaifAMService penaltyRaifAMService = penaltyRaifAMService_service.getPenaltyRaifAMServiceSoapHttpPort();

		String success = penaltyRaifAMService.approveStatus("id");*/

		StudentClient studentClient = ctx.getBean(StudentClient.class);
		System.out.println("For Student Id: 1");
		GetStudentResponse response = studentClient.getStudentById(1);
		System.out.println("Name:"+response.getStudent().getName());
		System.out.println("Age:"+response.getStudent().getAge());
		System.out.println("Class:"+response.getStudent().getClazz());

		/*PenaltyRaifAMClient penaltyRaifAMClient = ctx.getBean(PenaltyRaifAMClient.class);
		ApproveStatusResponse approveStatusResponse = penaltyRaifAMClient.getResponse();
		System.out.println(approveStatusResponse.getResult());*/
	}
}
