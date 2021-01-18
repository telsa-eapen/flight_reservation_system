package com.company;

public class RegularTicket extends Ticket {
    private String specialServices;
    public RegularTicket(Flight fl, Passenger p, String pnr, String from, String to, float departureDateTime, float arrivalDateTime,
                         String seatNo, float price)
    {
        super(fl,p,pnr,from,to,departureDateTime,arrivalDateTime,
        seatNo,price);
    }
   public String getSpecialServices()
   {
       return specialServices;
   }

    public void updateSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

}
