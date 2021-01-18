package com.company;

public class Main {

    public static void main(String[] args) {

   Passenger P=new Passenger("Kummanam","Kottayam","Kerala","Taniya", "8845","taniyasunil@ktm.com");
        Passenger P1=new Passenger("Kummanam","Kottayam","Kerala","Vaishnav", "8845","vaishnavsurendran@ktm.com");
   Flight F=new Flight("1","Indigo",10);

   if(F.checkAvailability()) {
       RegularTicket regular = new RegularTicket(F, P, "1234", "Kochi", "Goa", 12.30f, 4.00f, "1A", 1500);
       TouristTicket tourist = new TouristTicket(F, P1, "1234", "Kochi", "Goa", 12.30f, 4.00f,
               "1A", 1500);
       printTicketDetails(regular);
       printTicketDetails(tourist);
   }
   System.out.println(F.getBookedSeats());
    }

    public static void printTicketDetails(Ticket ticket)
    {
        System.out.println(ticket.getPnr());
    }
}
