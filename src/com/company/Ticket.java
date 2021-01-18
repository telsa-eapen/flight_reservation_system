package com.company;

public abstract class Ticket {
    private String pnr,from,to;
    Flight flight;
    private float departureDateTime,arrivalDateTime;
    Passenger passenger;
    private String seatNo;
    private float price;
    private boolean cancelled;
    public Ticket(Flight fl,Passenger p,String pnr,String from,String to,float departureDateTime,float arrivalDateTime,
                  String seatNo,float price)
    {
        flight=fl;
        flight.incrementBookingCounter();
        passenger=p;
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.seatNo=seatNo;
        this.price=price;
    }

    public boolean checkStatus()
    {
        return cancelled;
    }
    public void cancel()
    {
       cancelled=true;
    }
    public float getFlightDuration()
    {
        //calculate duration-find
        return departureDateTime-arrivalDateTime;
    }
    public String getPnr()
    {
        return  pnr;
    }
}
