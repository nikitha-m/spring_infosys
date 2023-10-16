package com.infosys.payment;

public class OrderService {
	private int orderId;
	private int quantity;
	private double price;
	
	private PaymentService paymentService;
	
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println("Order id: "+orderId);
		System.out.println("Quantity: "+quantity);
		System.out.println(("Price: "+price));
		System.out.print("Amount: "+paymentService.getTotalAmount());
	}
	public PaymentService getPaymentService() {
		return paymentService;
	}
}
