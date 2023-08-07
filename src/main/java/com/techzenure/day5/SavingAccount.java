/**
 * Program for banking application this consist sub class saving account details
 * @author Abhishek Mateti
 * @Since 01th August 2023
 */
package com.techzenure.day5;

public class SavingAccount extends Account {
	float roi;
	public SavingAccount(long acno, String name, float bal, float roi)
	{
		super(acno, name, bal);
		this.roi = roi;
	}
	public void calculateInterest()
	{
		float intrst = roi * this.getBal() / 100;
		super.deposit(intrst);
	}
}