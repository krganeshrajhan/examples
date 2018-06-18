package com.example.spring.ws.client;

import com.concretepage.soap.GetStudentRequest;
import com.concretepage.soap.GetStudentResponse;
import com.emc.drcap.penalty.model.bc.am.common.ApproveStatus;
import com.emc.drcap.penalty.model.bc.am.common.ApproveStatusResponse;
import com.emc.drcap.penalty.model.bc.am.common.ObjectFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component
public class PenaltyRaifAMClient extends WebServiceGatewaySupport {

	@Autowired
	private WebServiceTemplate webServiceTemplate;


	public ApproveStatusResponse getResponse() {

		ObjectFactory factory = new ObjectFactory();
		ApproveStatus approveStatus = factory.createApproveStatus();

		approveStatus.setSewUploadId("id");

		ApproveStatusResponse approveStatusResponse = (ApproveStatusResponse) webServiceTemplate.marshalSendAndReceive(approveStatus);

		return approveStatusResponse;
	}

	/*public ApproveStatusResponse getResponse() {
		ApproveStatus approveStatus = new ApproveStatus();
		ApproveStatusResponse response = (ApproveStatusResponse) webServiceTemplate.marshalSendAndReceive(approveStatus);
		return response;
	}*/


}
