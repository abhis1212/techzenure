/**
 * Program to calculate price of a ticket
 * @author Abhishek Mateti
 * @Since 02th August 2023
 */
package com.techzenure.day5;

import java.util.Scanner;

public class TicketPriceCalculator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int noOfBookings = scanner.nextInt();
        System.out.println();

        System.out.print("Enter the available tickets: ");
        int availableTickets = scanner.nextInt();
        Ticket.setAvailableTickets(availableTickets); // Set the initial available tickets

        for (int i = 1; i <= noOfBookings; i++)
        {
            System.out.print("Enter the ticketid: ");
            int ticketId = scanner.nextInt();

            System.out.print("Enter the price: ");
            int price = scanner.nextInt();

            System.out.print("Enter the no of tickets: ");
            int noOfTickets = scanner.nextInt();

            Ticket ticket = new Ticket(ticketId, price, Ticket.getAvailableTickets());
            int totalAmount = ticket.calculateTicketCost(noOfTickets);

            if (totalAmount != -1)
            {
                System.out.println("\nAvailable tickets: " + Ticket.getAvailableTickets());
                System.out.println("Total amount: " + totalAmount);
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
                System.out.println();
            } 
            else
            {
                System.out.println("Tickets not available for booking: " + noOfTickets);
            }
        }
        scanner.close();
	}
}