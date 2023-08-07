/**
 * Program for banking application this consist sub class current account details
 * @author Abhishek Mateti
 * @Since 01th August 2023
 */
package com.techzenure.day5;

public class CurrentAccount extends Account {
	int freeTrans = 3;
	int transactionsCount = 0;
	int transrate = 100;
	public CurrentAccount(long acno, String name, float bal) {
		super(acno, name, bal);
		
	}
	@Override
	public void deposit(float amt) {
		transactionsCount++;
		super.deposit(amt);
	}
	@Override
	public void withdraw(float amt) {
		transactionsCount++;
		super.withdraw(amt);
	}
	@Override
	public void getBalance() {
		transactionsCount++;
		super.getBalance();
	}
	
	public void serviceCharge()
	{
		int serviceChargeCounts = transactionsCount - freeTrans;
		if(serviceChargeCounts > 0)
		{
			transactionsCount = 0;
			float amt = serviceChargeCounts * transrate;
			super.withdraw(amt);
		}
		else 
		{
			System.out.println("No service charge for this time as you have done only " + transactionsCount + "/" +freeTrans);
		}
	}
}