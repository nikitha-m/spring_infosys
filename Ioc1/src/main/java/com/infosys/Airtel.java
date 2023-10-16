package com.infosys;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Airtel sim calling");

	}

	@Override
	public void data() {
		System.out.println("Browsing through Airtel");
	}

}
