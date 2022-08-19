package com.ifelseswitch.java;

import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int a = sc.nextInt();
        System.out.println("find even or Odd");
        if(a%2==0){
            System.out.println("Number"+ " " + a + "is a even Number");

        }else{
            System.out.println("Number "+ a+ " is a odd number");
        }

    }
}
