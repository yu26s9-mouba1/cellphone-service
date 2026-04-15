package com.pluralsight;

public class CellPhone {

    //Defining variables for the cellphone data or properties
    private int SerialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // Creating the constructor operator
    public CellPhone() {

        this.SerialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";


    }

//Creating or adding getters that will get data from the parameter constructor

    public int getSerialNumber() {
        return SerialNumber;

    }

    public String getmodel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getowner() {
        return owner;
    }

    
}


