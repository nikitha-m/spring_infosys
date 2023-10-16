package com.infosys.autoscan3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Autowired
	Sim aSim;
	
	public String toString() {
		return "I am using "+aSim.toString();
	}
}
