package com.infosys.autoscan4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Component
public class Service {
	
	@Autowired
	MessageService ms;
	
	public String toString() {
		return ms.toString();
	}
}
