package com.infosys.aop_assn;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {
	@Before("execution(public void deposit(int))")
	public void beforeDeposit() {
		System.out.println("Before deposit");
	}

	@After("execution(public void deposit(int))")
	public void afterDeposit() {
		System.out.println("After deposit");
	}

	@AfterReturning(pointcut = "execution(public int checkBalance())", returning = "result")
	public void afterReturningCheckBalance(Object result) {
		System.out.println("Balance: " + result);
	}
}
