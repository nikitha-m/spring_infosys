package com.infosys.autoscan1;

import org.springframework.beans.factory.annotation.Autowired;

public class Mobile {
	
	@Autowired
	Sim aSim;
	public String toString() {
		return "i am using "+aSim;
	}
}
