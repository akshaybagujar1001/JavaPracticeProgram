package com.ifelseswitch.java;

public class Max3IfElse {
    public static void main(String[] args) {
        int a,b,c,max;
        a=10;
        b=12;
        c=56;
        if(a>b){
            if(a>c)
                max=a;
            else
                max=c;
        }
        else{
            if(b>c)
                max = b;
            else max=c;
        }
        System.out.println("Maximum" +" " + max);
    }
}
