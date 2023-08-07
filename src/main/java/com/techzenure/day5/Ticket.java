/**
 * Program to calculate price of a ticket
 * @author Abhishek Mateti
 * @Since 02th August 2023
 */
package com.techzenure.day5;

public class Ticket
{
	 private int ticketid;
	    private int price;
	    private static int availableTickets;

	    public Ticket() 
	    {
	    }

	    @SuppressWarnings("static-access")
		public Ticket(int ticketid, int price, int availableTickets) {
	        this.ticketid = ticketid;
	        this.price = price;
	        this.availableTickets = availableTickets;
	    }

	    public int getTicketid()
	    {
	        return ticketid;
	    }

	    public void setTicketid(int ticketid)
	    {
	        this.ticketid = ticketid;
	    }
	    
	    public int getPrice()
	    {
	        return price;
	    }

	    public void setPrice(int price)
	    {
	        this.price = price;
	    }

	    public static int getAvailableTickets()
	    {
	        return availableTickets;
	    }

	    public static void setAvailableTickets(int availableTickets)
	    {
	        if (availableTickets >= 0)
	        {
	            Ticket.availableTickets = availableTickets;
	        }
	    }
	    
	    public int calculateTicketCost(int nooftickets)
	    {
	        if (nooftickets <= availableTickets)
	        {
	            availableTickets -= nooftickets;
	            return nooftickets * price;
	        }
	        else
	        {
	            return -1;
	        }
	    }
}