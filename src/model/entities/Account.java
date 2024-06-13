package model.entities;

import model.exception.AccountLimitException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account() {
		
	}
	
	
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		if(number == 0) {
			throw new NullPointerException();
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}



	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	
	public void deposit(Double amount) {
		this.balance += amount;
		System.out.println("Amount deposited sucessufully.");
	}
	
	public void withdraw(Double amount) throws AccountLimitException {
		if(amount > this.withdrawLimit) {
			throw new AccountLimitException("The amount exceeds withdraw limit.");
		}
		if(amount > this.getBalance()) {
			throw new AccountLimitException("Not enough balance");
		}
		this.balance -= amount;
	}
	
}
