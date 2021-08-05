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
        do {
            System.out.println("Your selection : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Working in process");
                    break;
                case 2:
                    System.out.println("1.Show room's list : ");
                    System.out.println("2.Search room by price : ");
                    System.out.println("3.Add more room here : ");
                    System.out.println("4.Change room's info here : ");
                    System.out.println("5.Check room status : ");
                    RoomView roomView = new RoomView();
                    do {
                        choice = 0;
                        System.out.println("your selection : ");
                        Scanner scanner1 = new Scanner(System.in);
                        choice = scanner1.nextInt();
                        switch (choice) {
                            case 1:
                                roomView.formShowRoomList();
                                break;
                            case 2:
                                roomView.formSearchRoomByPrice();
                                break;
                            case 3:
                                roomView.formAddRoom();
                                break;
                            case 4:
                                roomView.formEditRoom();
                                break;
                            case 5:
                                roomView.formCheckRoom();
                                break;
                        }
                    } while (choice != 0);
                    break;
                case 3:
                    System.out.println("1.Show bill's list : ");
                    System.out.println("2.Create a new bill : ");
                    System.out.println("3.Change a bill :  ");


            }
        } while (choice != 0);

    }
}
