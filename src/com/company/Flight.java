package com.company;

public class Flight {
private  String flightNumber;
private String airline;
private int capacity;
private int bookedSeats;
 public Flight(String flightNo,String airline,int capacity)
 {
     flightNumber=flightNo;
     this.airline=airline;
     this.capacity=capacity;
 }
public String getFlightDetails()
{
return flightNumber;
}
public boolean checkAvailability()
{
  if(bookedSeats<capacity)
      return true;
  else
      return false;
}
public void incrementBookingCounter()
{
bookedSeats++;
}
public int getBookedSeats()
{
    return bookedSeats;
}
public int getCapacity()
{
    return capacity;
}
}
