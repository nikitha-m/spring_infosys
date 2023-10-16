package com.infosys.autoscan4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class SMSService implements MessageService {
	public String toString() {
		return "Sending sms";
	}
}
