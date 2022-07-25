package com.addresssystem;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to address Book");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your firstname,lastname,city,phone number,zipcode");
        AddressSystem c1 = new AddressSystem(s1.nextLine(), s1.nextLine(), s1.nextLine(), s1.nextLong(), s1.nextInt());

    }
}//UC1
