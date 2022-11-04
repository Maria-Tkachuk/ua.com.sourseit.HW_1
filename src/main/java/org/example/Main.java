package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("""
                There are two options:
                    1.Fahrenheit -> Celsius
                    2.Celsius -> Fahrenheit
                Please choose options 1 or 2 and then hit Enter:""" + " ");
        int option = S.nextInt();
        if(option == 2) {
            System.out.print("Temperature in Celsius: ");
            double C = S.nextDouble();
            double F = (C * 9 / 5) + 32;
            System.out.print("Temperature in Fahrenheit: " + F);
        }else if (option == 1){
            System.out.print("Temperature in Fahrenheit: ");
            double F = S.nextDouble();
            double C = (F - 32) * 5 / 9;
            System.out.print("Temperature in Celsius: " + C);
        } else {
            System.out.println("Please specify option only 1 or 2");
        }
    }
}