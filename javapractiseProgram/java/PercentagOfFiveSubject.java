package com.javapractiseProgram.java;

import java.util.Scanner;

public class PercentagOfFiveSubject {
    public static void main(String[] args) {


        System.out.println("Enter Five Subject Marks");
        Scanner Marks = new Scanner(System.in);
        int sub1 = Marks.nextInt();
        int sub2 = Marks.nextInt();
        int sub3 = Marks.nextInt();
        int sub4 = Marks.nextInt();
        int sub5 = Marks.nextInt();

        int SumofAllSubject = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total marks of a subject" + SumofAllSubject);

        Float percentage_marks_of_all_subject = SumofAllSubject / 5F;
        System.out.println("percantage marks of all subject" + percentage_marks_of_all_subject);
    }
}

