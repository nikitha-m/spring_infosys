package com.infosys.aop;

import org.aspectj.lang.annotation.*;
//Aspect class

@Aspect
public class LoggingAspect {
	
	@After("execution(public String getName())")
	public void loggingAdvice() {
		System.out.println("Advice run. Get method calling");
	}
}
