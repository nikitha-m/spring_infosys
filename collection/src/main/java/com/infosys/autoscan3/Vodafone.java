package com.infosys.autoscan3;
import org.springframework.stereotype.Component;

@Component
public class Vodafone implements Sim {
	public String company() {
		return "Vodafone";
	}
}