package com.gustavolaureano.course.domain.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT("waiting payment"),
	PAID("paid"),
	SHIPPED("shipped"),
	DELIVERED("delivered"),
	CANCELED("canceled");
	
	private String status;
	
	private OrderStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public static OrderStatus parseToString(String status) {
		for (OrderStatus list : OrderStatus.values()) {
			if (list.getStatus() == status) {
				return list;
			}
		}
		throw new IllegalArgumentException("Invalid status: ");
	}
	

}
