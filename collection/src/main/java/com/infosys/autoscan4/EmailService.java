package com.infosys.autoscan4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailService implements MessageService {
	public String toString() {
		return "Sending email...";
	}
}
