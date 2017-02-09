package com.deloitte.choiceex;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class Laptop extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		ProductDto currentPayload = (ProductDto) message.getPayload();
		return "Discount on " + currentPayload.getProductName() + " with product code "
				+ currentPayload.getProductCode() + " is 20%";
	}
}
