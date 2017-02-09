package com.deloitte.choiceex;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class Default implements Callable {

	public String displayDiscount(MuleMessage message) {
		ProductDto currentPayload = (ProductDto) message.getPayload();
		return "We have no discount for " + currentPayload.getProductName() + " with product code "
				+ currentPayload.getProductCode();
	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		String payload = displayDiscount(eventContext.getMessage());
		return payload;
	}
}
