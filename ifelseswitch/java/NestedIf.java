package com.ifelseswitch.java;

public class NestedIf {
    public static void main(String[] args) {
        int a = 10;
        if (a>0){
            if(a<=10){
                System.out.println("a");
                if(a<5){
                    System.out.println("b");
                    if(a<20){
                        System.out.println("d");
                    }
                }
            }
        }
    }
}
