package com.company.view;

import java.util.Scanner;

public class LoginView {
    public static void main(String[] args) {
        System.out.println("Log in - Sign in :");
        System.out.println("1.Log-in");
        System.out.println("2.Sign-in");
        System.out.println("0.Exit ");
        UserView userView = new UserView();
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your selection : ");
        choice = sc.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Login to see management options :");
                    userView.login();
                    break;
                case 2:
                    System.out.println("Create a new account here : ");
                    userView.createNewAccount();
                    break;
            }
        } while (choice != 0);
    }
}
