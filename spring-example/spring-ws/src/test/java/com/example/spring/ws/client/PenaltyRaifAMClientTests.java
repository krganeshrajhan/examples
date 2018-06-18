package com.example.spring.ws.client;

import com.emc.drcap.penalty.model.bc.am.common.ApproveStatusResponse;
import com.example.spring.ws.config.ClientAppConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ClientAppConfig.class})
public class PenaltyRaifAMClientTests {

	@Autowired
	PenaltyRaifAMClient penaltyRaifAMClient;

	@Test
	public void testApproveStatus() {
		ApproveStatusResponse approveStatusResponse = penaltyRaifAMClient.getResponse();

	}
}
