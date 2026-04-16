package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Now that I have setted the cellphone parametters, I can create the object which is the cellphone

        CellPhone phone = new CellPhone();// This will allow the object to be built from memory
        CellPhone phone2 = new CellPhone(); // Created a second phone
        // Prompting the user for the serial number

        System.out.print("What is the serial number? ");
        int serial = scanner.nextInt();
        scanner.nextLine(); //Making it clears the buffer after user input
        phone.setSerialNumber(serial);

        //Prompting the user for the phone model

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        phone.setModel(model);


        //Prompting the user for the phone carrier

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        phone.setCarrier(carrier);

        //Prompting the user for the phone number
        System.out.print("What is the phone number? ");
        String number = scanner.nextLine();
        phone.setPhoneNumber(number);


        ////Prompting the user for the phone owner
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);

        //Setting up phone 2

        phone2.setSerialNumber(2);
        phone2.setModel("iPhone");
        phone2.setCarrier("Verizon");
        phone2.setPhoneNumber("855-555-2222");
        phone2.setOwner("Mubarak");



        //Now, that we have collected al informations from the user we can display the phone info using getters

//        System.out.println("\n--- Phone Info ---");
//        System.out.println("Serial Number: " + phone.getSerialNumber());
//        System.out.println("Model: " + phone.getModel());
//        System.out.println("Carrier: " + phone.getCarrier());
//        System.out.println("Phone Number: " + phone.getPhoneNumber());
//        System.out.println("owner: " + phone.getOwner());


        //Displaying both phones
        display(phone);
        display(phone2);

        //Dialing
        phone.dial(phone2.getPhoneNumber());
        phone2.dial(phone.getPhoneNumber());








    }



    //Created a method that allows the display of the callers' info
    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("------------------------");
    }

}
