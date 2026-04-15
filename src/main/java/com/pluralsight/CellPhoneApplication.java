package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Now that I have setted the cellphone parametters, i can create the object which is the cellphone

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


        







    }

}
