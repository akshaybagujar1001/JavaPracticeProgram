package com.ifelseswitch.java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        Scanner sc = new Scanner((System.in));
        System.out.println("find a leap year");
        int n = sc.nextInt();
        if(n%100==0){
            if(n%400==0)
                System.out.println("this is leap year");

                else
                System.out.println("this is not a leap year");

        } else if (n%4==0)
            System.out.println("this is leap year");
            else
            System.out.println("this is not leapp year");

            }

        }

