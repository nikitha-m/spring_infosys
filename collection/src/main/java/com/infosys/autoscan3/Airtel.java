package com.infosys.autoscan3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Airtel implements Sim {
	public String company() {
		return "Airtel";
	}
}
