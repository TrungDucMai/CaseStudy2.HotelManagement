package com.company.view;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("MENU :");
        System.out.println("1.Sign in - Sign out.");
        System.out.println("2.Room management. ");
        System.out.println("3.Bill management. ");
        System.out.println("0.Exit ");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Your selection : ");
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Working in process");
                break;
            case 2:
                System.out.println("1.Show room's list : ");

                System.out.println("2.Search room by ID : ");
                System.out.println("3.Add more room here : ");
                System.out.println("4. Change room's info here : ");
            case 3:
                System.out.println("1.Show bill's list : ");
                System.out.println("2.Create a new bill : ");
                System.out.println("3.Change a bill :  ");
            case 0:
                System.out.println("return");

        }


    }
}
