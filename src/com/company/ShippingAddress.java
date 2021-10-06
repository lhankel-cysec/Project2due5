package com.company;

import javax.swing.plaf.nimbus.State;
import java.util.Scanner;

public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;

    public void AddressLine1(){
        Scanner AddressLine1 = new Scanner(System.in);
        System.out.println("Please enter your address line 1: ");

    }
    public void AddressLine2(){
        Scanner AddressLine2 = new Scanner(System.in);
        System.out.println("Please enter your address line 2 if" +
                "no address line 2 type null: ");

    }
    public void City(){
        Scanner City = new Scanner(System.in);
        System.out.println("What is your city?: ");
    }
    public void State(){
        Scanner State = new Scanner(System.in);
        System.out.println("Pleat type your State");
    }
    public void PostalCode(){
        Scanner PostalCode = new Scanner(System.in);
        System.out.println("What is your zip code?");
    }
    public ShippingAddress(String AddressLine1, String AddressLine2,
                           String City, String State, int PostalCode)

}
