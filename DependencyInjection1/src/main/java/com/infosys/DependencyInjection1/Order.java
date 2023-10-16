package com.infosys.DependencyInjection1;

public class Order {
	private String productid;
	private String productname;
	private String orderdate;
	private Customer customer;

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void displayord() {
		System.out.println("product id =" + productid);
		System.out.println("product name =" + productname);
		System.out.println("order date =" + orderdate);
		System.out.println("customer =" + customer);
	}
}
