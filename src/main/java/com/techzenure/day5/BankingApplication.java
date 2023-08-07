/**
 * Program for banking application 
 * * @author Abhishek Mateti
 * @Since 01th August 2023
 */
package com.techzenure.day5;

import java.util.Scanner;

public class BankingApplication
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Account acc = null;
			
		while(true)
		{
			System.out.println("1: Create an account");
			System.out.println("2: Deposit");
			System.out.println("3: Withdraw");
			System.out.println("4: balance");
			System.out.println("5: Interest Calculation");
			System.out.println("6: Service Charge");
			System.out.println("7: Exit");
				
			System.out.print("Enter an option : " );
			int opt = sc.nextInt();
				
			switch(opt)
			{
				case 1:
					if(acc == null)
					{
						System.out.print("Enter type of a/c [1.Saving A/c | 2.Current A/c] :");
						int accType = sc.nextInt();
							
						System.out.print("Enter a/c no : ");
						long acno = sc.nextLong();
						sc.nextLine();
							
						System.out.print("Enter the name : ");
						String name = sc.nextLine();
						
						System.out.print("Enter the initial deposit Rs : ");
						float amt = sc.nextFloat();
						
						if(accType == 1)
						{
							System.out.print("Enter rate of interest : ");
							float roi = sc.nextFloat();
							acc = new SavingAccount(acno, name, amt, roi);
						}
						else 
						{
							acc = new CurrentAccount(acno, name, amt);
						}
						acc = new Account(acno,name,amt);
						System.out.println("Welcome to our bank");
						System.out.println();
					}
					else 
					{
						System.out.println("Please open an Account");
						System.out.println();
					}
					break;
						
				case 2:
					if(acc != null)
					{
						System.out.print("Enter the Amount to Deposit: ");
							float amt = sc.nextFloat();
						acc.deposit(amt);
						System.out.println();
					}
					else 
					{
						System.out.println("Please open an Account");
						System.out.println();
					}
					break;
						
				case 3:
					if(acc != null)
					{
						System.out.print("Enter the Amount to withdraw : ");
						float amt = sc.nextFloat();
						acc.withdraw(amt);
						System.out.println();
					}
					else 
						System.out.println("Please open an Account");
						System.out.println();
					break;
						
				case 4:
					if(acc != null)
					{
						acc.getBalance();
					}
					else 
					{
						System.out.println("Please open an Account");
						System.out.println();
					}
					break;
						
				case 5:
					if(acc instanceof SavingAccount)
					{
						((SavingAccount)acc).calculateInterest();
					}
					else
					{
						System.out.println("This A/c will not be having this service");
					}
					break;
						
				case 6:
					if(acc instanceof CurrentAccount)
					{
						((CurrentAccount)acc).serviceCharge();
					}
					else
					{
						System.err.println("No service charges for this type of account");
					}
					break;
						
				case 7:
					System.out.println("Application created by Techzenure");
					System.out.println();
					break;
						
				default:
					System.err.println("Invalid Option Try Again____");
					System.out.println();
			}
		}
	}
}