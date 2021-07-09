package com.egitim.ikincihafta;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args)
    {
        calculateGrade();
    }
    public static void calculateGrade()
    {
        int firstNote;
        int secondNote;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first note:");
        firstNote = scan.nextInt();
        System.out.print("Enter your second note:");
        secondNote = scan.nextInt();
        average = (firstNote*0.4 + secondNote*0.6);
        if (average >= 0 && average<=20)
        {
            System.out.println(" Your letter grade: FF" + average);
        }
        else if (average>20 && average <= 50)
        {
            System.out.println(" Your letter grade: CB" + average);
        }
        else if (average>50 && average <= 70)
        {
            System.out.println(" Your letter grade: BB" + average);
        }
        else if (average>70 && average <= 100)
        {
            System.out.println(" Your letter grade: AA" + average);
        }
        else
        {
            System.out.println("Please enter a valid note!");
        }
    }

}
