package com.example.spring.ws.client;

import com.concretepage.soap.GetStudentRequest;
import com.concretepage.soap.GetStudentResponse;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class StudentClient extends WebServiceGatewaySupport {
	public GetStudentResponse getStudentById(int studentId) {
		GetStudentRequest request = new GetStudentRequest();
		request.setStudentId(studentId);
		GetStudentResponse response = (GetStudentResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://localhost:9999/spring4soap/soapws/getStudentResponse"));
		return response;
	}
}
