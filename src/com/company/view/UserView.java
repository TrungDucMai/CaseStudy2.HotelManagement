package com.company.view;

import com.company.controller.UserManagement;
import com.company.model.User;

import java.io.IOException;
import java.util.Scanner;

public class UserView {
    UserManagement userManagement = new UserManagement();
    static Validate validate = new Validate();

    public void formShowUser() {
        try {
            userManagement.showUserList();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createNewAccount() {
        User user = new User();
        System.out.println("Enter your infomation to sign in :");
        System.out.println("Enter your user's name  :");
        boolean checkAccount;
        do {
            Scanner scanner = new Scanner(System.in);
            String account = scanner.nextLine();
            checkAccount = Validate.isAccount(account);
            if (checkAccount) {
                String checkedAccount = account;
                user.setAccount(checkedAccount);
                System.out.println("user's name is accepted.");
            } else {
                System.out.println("user's name must have 8 to 16 charters. please re-enter you user's name ");
            }
        } while (!checkAccount);
        System.out.println("Enter your password :");
        boolean checkPassword;
        do {
            Scanner scanner1 = new Scanner(System.in);
            String password = scanner1.nextLine();
            checkPassword = Validate.isPassword(password);
            if (checkPassword) {
                String checkedPassword = password;
                user.setPasswords(checkedPassword);
                System.out.println("password is accepted.");
            } else {
                System.out.println("password must have 8 to 16 charters. please re-enter you user's name ");
            }
        } while (!checkPassword);

        System.out.println("Enter your phone number :");
        boolean checkPhoneNumber;
        do {
            Scanner scanner2 = new Scanner(System.in);
            String phoneNumber = scanner2.nextLine();
            checkPhoneNumber = Validate.isPhoneNumber(phoneNumber);
            if (checkPhoneNumber) {
                String checkedPhoneNumber = phoneNumber;
                user.setPhoneNumber(checkedPhoneNumber);
                System.out.println("Phone number is accepted.");
            } else {
                System.out.println("Phone number must have 10 numbers. Please re-enter your phone number ");
            }
        } while (!checkPhoneNumber);

        System.out.println("Enter your address : ");
        Scanner scanner3 = new Scanner(System.in);
        String address = scanner3.nextLine();
        user.setAddress(address);

        System.out.println("Enter your email : ");
        boolean checkEmail;
        do {
            Scanner scanner4 = new Scanner(System.in);
            String email = scanner4.nextLine();
            checkEmail = Validate.isEmail(email);
            if (checkEmail) {
                String checkedEmail = email;
                System.out.println("Email is accepted.");
                user.setEmail(checkedEmail);
            } else {
                System.out.println("Email must form abc@gmail.com . Please re-enter your email ");
            }
        } while (!checkEmail);


        System.out.println("Enter your name : ");
        Scanner scanner5 = new Scanner(System.in);
        String name = scanner5.nextLine();
        user.setName(name);

        System.out.println("Enter your age : ");
        Scanner scanner6 = new Scanner(System.in);
        int age = scanner6.nextInt();
        boolean checkAge;
        do {
            if (age >= 18) {
                int checkedAge = age;
                user.setAge(age);
                System.out.println("Age is accepted");
                checkAge = true;
            } else {
                checkAge = false;
            }
        } while (!checkAge);

        try {
            userManagement.addUser(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void formdeleteUser() {
        System.out.println("Enter user's account : ");
        Scanner scanner = new Scanner(System.in);
        String account = scanner.nextLine();

        int index = userManagement.findUserByAccount(account);
        try {
            userManagement.deleteUser(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void formEditUser() {
        System.out.println("Enter user's account :");
        Scanner sc = new Scanner(System.in);
        String checkaccount = sc.nextLine();
        int index = userManagement.findUserByAccount(checkaccount);
        User user = new User();
        System.out.println("Enter your user's name  :");
        boolean checkAccount;
        do {
            Scanner scanner = new Scanner(System.in);
            String account = scanner.nextLine();
            checkAccount = Validate.isAccount(account);
            if (checkAccount) {
                String checkedAccount = account;
                user.setAccount(checkedAccount);
                System.out.println("user's name is accepted.");
            } else {
                System.out.println("user's name must have 8 to 16 charters. please re-enter you user's name ");
            }
        } while (!checkAccount);
        System.out.println("Enter your password :");
        boolean checkPassword;
        do {
            Scanner scanner1 = new Scanner(System.in);
            String password = scanner1.nextLine();
            checkPassword = Validate.isPassword(password);
            if (checkPassword) {
                String checkedPassword = password;
                user.setPasswords(checkedPassword);
                System.out.println("password is accepted.");
            } else {
                System.out.println("password must have 8 to 16 charters. please re-enter you user's name ");
            }
        } while (!checkPassword);

        System.out.println("Enter your phone number :");
        boolean checkPhoneNumber;
        do {
            Scanner scanner2 = new Scanner(System.in);
            String phoneNumber = scanner2.nextLine();
            checkPhoneNumber = Validate.isPhoneNumber(phoneNumber);
            if (checkPhoneNumber) {
                String checkedPhoneNumber = phoneNumber;
                user.setPhoneNumber(checkedPhoneNumber);
                System.out.println("Phone number is accepted.");
            } else {
                System.out.println("Phone number must have 10 numbers. Please re-enter your phone number ");
            }
        } while (!checkPhoneNumber);

        System.out.println("Enter your address : ");
        Scanner scanner3 = new Scanner(System.in);
        String address = scanner3.nextLine();
        user.setAddress(address);

        System.out.println("Enter your email : ");
        boolean checkEmail;
        do {
            Scanner scanner4 = new Scanner(System.in);
            String email = scanner4.nextLine();
            checkEmail = Validate.isEmail(email);
            if (checkEmail) {
                String checkedEmail = email;
                System.out.println("Email is accepted.");
                user.setEmail(checkedEmail);
            } else {
                System.out.println("Email must form abc@gmail.com . Please re-enter your email ");
            }
        } while (!checkEmail);


        System.out.println("Enter your name : ");
        Scanner scanner5 = new Scanner(System.in);
        String name = scanner5.nextLine();
        user.setName(name);

        System.out.println("Enter your age : ");
        Scanner scanner6 = new Scanner(System.in);
        int age = scanner6.nextInt();
        boolean checkAge;
        do {
            if (age >= 18) {
                int checkedAge = age;
                user.setAge(age);
                System.out.println("Age is accepted");
                checkAge = true;
            } else {
                checkAge = false;
            }
        } while (!checkAge);
        try {
            userManagement.editUser(index, user);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void login() {
        System.out.println("Account :");
        Scanner scanner = new Scanner(System.in);
        String account = scanner.nextLine();
        System.out.println("Password :");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.nextLine();

        boolean check = Validate.checkLogIn(account, password);
        if (check = true) {
            Menu.ManagementMenu();
        } else {
            System.out.println("Something is wrong, please try again ");

        }
    }
}