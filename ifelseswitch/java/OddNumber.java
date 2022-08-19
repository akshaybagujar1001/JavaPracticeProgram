package com.ifelseswitch.java;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if(n%2==1){
            System.out.println("Number " + n + " Odd Number");
        }else {
            System.out.println("Number " + n + "Even Number");
        }
    }
}
