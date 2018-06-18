package com.example.spring.ws.model;

import com.emc.drcap.penalty.model.bc.am.common.ApproveStatus;
import com.emc.drcap.penalty.model.bc.am.common.ApproveStatusResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PenaltyRaifAMEndpoint {

	private static final String NAMESPACE_URI = "http://com/emc/drcap/penalty/model/bc/am/common/";

	@PayloadRoot(localPart = "approveStatus", namespace = NAMESPACE_URI)
	@ResponsePayload
	public ApproveStatusResponse approveStatus(@RequestPayload ApproveStatus approveStatus) {
		ApproveStatusResponse approveStatusResponse =  new ApproveStatusResponse();
		approveStatusResponse.setResult("success");
		return approveStatusResponse;
	}

}
