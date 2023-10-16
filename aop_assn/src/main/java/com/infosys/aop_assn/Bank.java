package com.infosys.aop_assn;

public class Bank {
	int accountNumber;
    int amount;

    public void deposit(int amount) {
        this.amount += amount;
    }

    public int checkBalance() {
        return this.amount;
    }
}
