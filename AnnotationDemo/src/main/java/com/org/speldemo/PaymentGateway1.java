package com.org.speldemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("paymentGateway")
public class PaymentGateway1 {
	@Value("{beanOrder.item}")
	private String itemName;
	@Value("{beanOrder}")
	private Order order;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	

}
