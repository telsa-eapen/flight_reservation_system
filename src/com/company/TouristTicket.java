package com.company;

import java.util.ArrayList;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    ArrayList<String> selectedTouristLocations=new ArrayList<String>();
    public TouristTicket(Flight fl,Passenger p,String pnr,String from,String to,float departureDateTime,float arrivalDateTime,
                         String seatNo,float price)
    {
        super(fl,p,pnr,from,to,departureDateTime,arrivalDateTime,
                seatNo,price);
    }
    ArrayList<String> getSelectedTouristLocations()
    {
        return selectedTouristLocations;
    }
    void addTouristLocations(String location)
    {
        selectedTouristLocations.add(location);
    }
    void  removeTouristLocations(String location)
    {
        selectedTouristLocations.remove(location);
    }
}
