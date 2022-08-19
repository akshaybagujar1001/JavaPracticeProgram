package com.javapractiseProgram.java;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("Enter a Km");
        Scanner km= new Scanner(System.in);
        Float EnterKm = km.nextFloat();
        Float KmToMile = EnterKm*0.62F;

        System.out.println("Convert KM to Miles" );
        System.out.println(EnterKm +"Km is Equal To " + KmToMile+ "Miles");

    }
}
