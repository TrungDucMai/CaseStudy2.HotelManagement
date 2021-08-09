package com.company.view;

import com.company.controller.UserManagement;
import com.company.model.User;
import com.company.storage.UserFileManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean isAccount(String account) {
        Pattern pattern = Pattern.compile("^[a-z0-9]{8,16}$");
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }

    public static boolean isPassword(String password) {
        Pattern pattern = Pattern.compile("^[a-z0-9]{8,16}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean isPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isEmail(String email) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9]+[A-Za-z0-9]*@gmail\\.com");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }



    public static boolean checkLogIn(String account, String password) {
//        UserManagement userManagement = new UserManagement();
        List<User> userList = new ArrayList<>();
        try {
            userList = UserFileManagement.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < userList.size(); i++) {
            if (account.equals(userList.get(i).getAccount()) && password.equals(userList.get(i).getPasswords())) {
                return true;
            }
        }
        return false;
    }
    public static String checkEmpty() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String typein = scanner.nextLine();
            if (typein.trim().isEmpty() != true) {
                return typein;
            } else {
                System.out.println("You haven't type anything. Please retry :  ");
            }
        }
    }

}
