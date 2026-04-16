package com.pluralsight;

public class CellPhone {


    //Adding a method 'dial' that will allow the user to see who is calling their phone and their phone number
    public void dial(String phoneNumber){
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }

    //Defining variables for the cellphone data or properties
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // Creating the constructor operator
    public CellPhone() {

        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";


    }

//Creating or adding getters that will get data from the parameter constructor

    public int getSerialNumber() {
        return serialNumber;

    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
            this.carrier = carrier;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}


