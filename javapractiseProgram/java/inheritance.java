package com.javapractiseProgram.java;

public class inheritance {
    void m1(){
        System.out.println("m1 method");
    }
    void m2 (){
        System.out.println("m2method");
    }

}
class child extends inheritance
{
    void m3(){
        System.out.println("m3 method");
    }
    void m4 (){
        System.out.println("m4 motyhod");
    }

    public static void main(String[] args) {


       inheritance c = new inheritance();

        c.m1();
        c.m2();
child s = new child();
        s.m3();
       s.m4();
    }
}
