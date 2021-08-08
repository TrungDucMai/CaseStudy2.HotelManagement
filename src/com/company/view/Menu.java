package com.company.view;

import java.util.Scanner;

public class Menu {

    public static void ManagementMenu() {
        UserView userView = new UserView();
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
                    System.out.println("1.List of signed account");
                    System.out.println("2.Edit account info :");
                    System.out.println("3.Delete account");
                    System.out.println("4.Return to main menu");
                    System.out.println("5.Exit");
                    int choice3 = -1;
                    do {
                        System.out.println("Your selection : ");
                        choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1:
                                userView.formShowUser();
                                break;
                            case 2:
                                userView.formEditUser();
                                break;
                            case 3:
                                userView.formdeleteUser();
                                break;
                            case 4:
                                Menu.ManagementMenu();
                        }
                    } while (choice3 != 0);
                case 2:
                    System.out.println("1.Show room's list : ");
                    System.out.println("2.Search room by price : ");
                    System.out.println("3.Add more room here : ");
                    System.out.println("4.Change room's info here : ");
                    System.out.println("5.Check room status : ");
                    System.out.println("6.Delete a room : ");
                    System.out.println("7.Return to main menu : ");
                    System.out.println("0.Exit");
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
                                break;
                            case 7:
                                Menu.ManagementMenu();
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 3:

                    System.out.println("1.Show bill's list : ");
                    System.out.println("2.Create a new bill : ");
                    System.out.println("3.Change a bill :  ");
                    System.out.println("4.Delete a bill : ");
                    System.out.println("5.Return to main menu");
                    System.out.println("0.Exit");
                    BillView billView = new BillView();
                    int choice2 = -1;
                    do {
                        System.out.println("your selection : ");
                        Scanner scanner2 = new Scanner(System.in);
                        choice2 = scanner2.nextInt();
                        switch (choice2) {
                            case 1:
                                billView.formShowBill();
                                break;
                            case 2:
                                billView.formAddBill();
                                break;
                            case 3:
                                billView.formEditBill();
                                break;
                            case 4:
                                billView.formdeleteBill();
                                break;
                            case 5 :
                                Menu.ManagementMenu();
                                break;
                        }
                    } while (choice2 != 0);
            }


        } while (choice != 0);
    }

}
