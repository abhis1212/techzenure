/**
 * Program to find price of movie ticket
 * @author Abhishek Mateti
 * @Since 28th July 2023
 */

package com.techzenure.day3;

import java.util.Scanner;

public class MovieTicketCalculation {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double kingClassTicket = 75.0;
        double queenClassTicket = 150.0;
        
		int minTickets = 5;
        int maxTickets = 40;
                        
		System.out.print("Enter the no of ticket : ");
		int noOfTicket = sc.nextInt();
        double bulkBookingDisPerce = 10.0;

		
		if(noOfTicket <= minTickets || noOfTicket >= maxTickets)
        {
        	System.out.print("Minimum of 5 and Maximum of 40 Tickets");
        	return;
        }
		
		System.out.print("Do you want any refreshment : ");
		char refreshment = sc.next().charAt(0);
        double refreshmentCostPerMem = 50.0;
		double refreshmentTotalCost = 0;
		
		if(refreshment == 'Y' || refreshment == 'y')
        {
			refreshmentTotalCost = refreshmentCostPerMem * noOfTicket;
        }
		
		System.out.print("Do you have any coupon code : ");
		char couponCode = sc.next().charAt(0);
        double couponDisPerce = 2.0;

		double couponDiscount = 0;
		
		System.out.print("Enter the circle : ");
		char circle = sc.next().charAt(0);
        double price, totalCost;
		
		if(couponCode == 'Y' || couponCode == 'y')
        {
			if(circle == 'K' || circle == 'k')
			{	
				couponDiscount = (kingClassTicket * noOfTicket + refreshmentTotalCost) * couponDisPerce/100.0;
			}
			if(circle == 'Q' || circle == 'q')
			{	
				couponDiscount = (queenClassTicket * noOfTicket + refreshmentTotalCost) * couponDisPerce/100.0;
			}
		}
		
        if(circle == 'K' || circle == 'k')
        {
        	price = kingClassTicket;
       	}
       	else if(circle == 'Q' || circle == 'q')
       	{
       		price = queenClassTicket;
       	}
       	else 	
       	{
       		System.out.println("Invalid Input for Circle");
       		return;
        }
        totalCost = (price * noOfTicket + refreshmentTotalCost) - couponDiscount;
        
        if (noOfTicket > 20) 
        {
        	double bulkDiscount = ((price * noOfTicket) + refreshmentTotalCost) * bulkBookingDisPerce / 100.0;
            totalCost -= bulkDiscount; 
        }
        
        System.out.println();
        System.out.println();
        System.out.printf("Ticket cost: %.2f", totalCost);
		sc.close();
	}
}
