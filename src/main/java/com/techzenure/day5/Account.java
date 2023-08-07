/**
 * Program for banking application this consist super class account details
 * @author Abhishek Mateti
 * @Since 01th August 2023
 */
package com.techzenure.day5;

public class Account
{
	private long acno;
	private String name;
	private float bal;
	
	public Account(long acno, String name, float bal)
	{
		super();
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	
	public float getBal() {
		return bal;
	}

	public void deposit(float amt)
	{
		this.bal += amt;
		System.out.println("Rs."+amt+" Credited | Balance: " + this.bal);
	}
	
	public void withdraw(float amt)
	{
		if(this.bal>=amt)
		{
			this.bal=this.bal-amt;
			System.out.println("Rs."+amt+" Debited | Balance: " + this.bal);
		}
		else
			System.err.println("ERROR: Insufficent Balance");
	}
	
	public void getBalance()
	{
		System.out.println("A/C no: " + this.acno +" | Name : " + this.name + " | Balance : " + this.bal);
	}
	
}