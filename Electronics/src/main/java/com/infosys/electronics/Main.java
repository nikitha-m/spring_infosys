package com.infosys.electronics;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Electronics electronics = (Electronics) context.getBean("electronics");

		Map<CustomerDetail, ProductDetail> orders = electronics.getOrders();
		for (Map.Entry<CustomerDetail, ProductDetail> map : orders.entrySet()) {
			CustomerDetail customer = map.getKey();
			ProductDetail product = map.getValue();
			System.out.println(customer.getCustomerName() + " Age: " + customer.getCustomerAge() + " "
					+ product.getQuantity() + " " + product.getProductName());
		}
	}

}
