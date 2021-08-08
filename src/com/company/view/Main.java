package com.company.view;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Log in - Sign in :");
        UserView userView = new UserView();
        int choice5 = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your selection : ");
        System.out.println("1.Log-in");
        System.out.println("2.Sign-in");
        System.out.println("0.Exit ");
        do {
            switch (choice5) {
                case 1:
                    System.out.println("Login to see management options :");

                    break;
                case 2:
                    System.out.println("Create a new account here : ");
                    userView.createNewAccount();
                    break;
            }
        } while (choice5 != 0);


        System.out.println("MENU :");
        System.out.println("1.Signed accounts list.");
        System.out.println("2.Room management. ");
        System.out.println("3.Bill management. ");
        System.out.println("0.Exit ");
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Your selection : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("List of signed account");

                    userView.formShowUser();
                    break;
                case 2:
                    System.out.println("1.Show room's list : ");
                    System.out.println("2.Search room by price : ");
                    System.out.println("3.Add more room here : ");
                    System.out.println("4.Change room's info here : ");
                    System.out.println("5.Check room status : ");
                    System.out.println("6.Delete a room : ");
                    RoomView roomView = new RoomView();
                    int choice1 = -1;
                    do {

                        System.out.println("your selection : ");
                        Scanner scanner1 = new Scanner(System.in);
                        choice1 = scanner1.nextInt();
                        switch (choice1) {
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
                            case 6:
                                roomView.formdeleteRoom();
                        }
                    } while (choice1 != 0);
                    break;
                case 3:

                    System.out.println("1.Show bill's list : ");
                    System.out.println("2.Create a new bill : ");
                    System.out.println("3.Change a bill :  ");
                    System.out.println("4. delete a bill : ");
                    BillView billView = new BillView();
                    int choice2 = -1;
                    do {
                        System.out.println("your selection : ");
                        Scanner scanner2 = new Scanner(System.in);
                        choice1 = scanner2.nextInt();
                        switch (choice2) {
                            case 1:
                                billView.formShowBill();
                                break;
                            case 2:
                                billView.formAddBill();
                                break;
                            case 3:
                                break;
                            case 4:
                                billView.formdeleteBill();
                                break;
                        }
                    } while (choice2 != 0);
            }


        } while (choice != 0);

    }
}
