package com.deloitte.choiceex;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class ProductTransformer extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		List<Map> payload = (List<Map>) message.getPayload();
		Map productMap = payload.get(0);
		Set<String> keys = productMap.keySet();
		ProductDto product = new ProductDto();
		for (String key : keys) {
			switch (key) {
			case "no":
				product.setProductId((int) productMap.get(key));
				break;
			case "product_name":
				product.setProductName((String) productMap.get(key));
				break;
			case "product_code":
				product.setProductCode((String) productMap.get(key));
				break;
			default:
				break;
			}
		}
		message.setInvocationProperty("productId", product.getProductId());
		return product;
	}

}
