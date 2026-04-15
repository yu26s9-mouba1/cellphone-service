package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Now that I have setted the cellphone parametters, I can create the object which is the cellphone

        CellPhone phone = new CellPhone(); // This will allow the object to be built from memory

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


        //Now, that we have collected al informations from the user we can display the phone info using getters

        System.out.println("\n--- Phone Info ---");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());







    }

}
