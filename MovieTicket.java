package com.egitim.ikincihafta;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args){

        double ticketPrice = 30;
        String category1= "Horror";
        String category2= "Action";
        String category3= "Comedy";
        String category4= "Romance";

        System.out.println("****Welcome To The Cinema****");
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Which category do you want to watch?");
        String category = scan1.nextLine();

    }
   public static void ageDiscount(int age)
    {

        double ticketPrice = 30;
        if(age<18) {
            ticketPrice = ticketPrice - ( ticketPrice * 0.10);
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }
        else if(age >= 18 && age <=25) {
            ticketPrice = ticketPrice - ( ticketPrice * 0.05);
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }
        else {
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }
    }

     public static void categoryDiscount(String category)
    {
        double ticketPrice = 30;
        if (category == "1")
        {
            ticketPrice = ticketPrice - ( ticketPrice * 0.01);
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }
        else if(category == "2" || category == "3" || category == "4")
        {
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }

        else
        {
            System.out.println("Invalid category!");
        }
    }
}
