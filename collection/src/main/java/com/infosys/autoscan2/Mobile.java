package com.infosys.autoscan2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
	
	@Autowired
	Sim aSim;
	
	public String toString() {
		return "i am using "+aSim.toString();
	}
}
