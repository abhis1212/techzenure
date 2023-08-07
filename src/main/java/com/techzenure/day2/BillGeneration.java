/**
 * Program to generate a bill 
 * @author Abhishek Mateti
 * @since 27th July 2023
 */
package com.techzenure.day2;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int pz = 100;
		int pf = 20;
		int cd = 10;
		
		System.out.print("Enter the number of  pizza ordered 		: ");
		int pzo = sc.nextInt();	//to get number of orders for pizza
		
		System.out.print("Enter the number of  puffs ordered 		: ");
		int pfo = sc.nextInt();	//to get number of orders for puffs
		
		System.out.print("Enter the number of  cold drinks ordered 	: ");
		int cdo = sc.nextInt();	//to get number of orders for cool drinks
		
		System.out.println();
		
		System.out.println("Bill details");
		System.out.println("No of pizzas      : " + pzo + " 		| cost : " + pzo * pz);
		System.out.println("No of puffs       : " + pfo + " 		| cost : " + pfo * pf);
		System.out.println("No of cool drinks : " + cdo + " 		| cost : " + cdo * cd);
		
		float fb = (pzo * pz)+(pfo * pf)+(cdo * cd);  //to get the total cost of the order	
		System.out.println("Total price = " + fb);
		System.out.println("ENJOY THE SHOW!!");
	}
}
