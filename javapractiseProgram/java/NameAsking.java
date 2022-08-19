package com.javapractiseProgram.java;

import java.util.Scanner;

public class NameAsking {
    public static void main(String[] args) {
        System.out.println("what is your name?");
        Scanner Sc = new Scanner(System.in);
        String name =Sc.nextLine();
        System.out.println("hello"+ name +  "Have a Good Day");
    }
}
