package com.company;

public class Passenger
{
    private static int idcounter;

    private int id;

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private static class Contact {
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    Address address;
    Contact contact;
    static
    {
        idcounter=0;
    }
    Passenger(String street, String city, String state,String name, String phone, String email)
    {
        this.id=++idcounter;
        this.address=new Address(street, city,state);
        this.contact=new Contact(name,phone,email);
    }

    public int getPassengerCount()
    {
        return idcounter;
    }
    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }
}
