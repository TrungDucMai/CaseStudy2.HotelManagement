package com.company.view;

import com.company.controller.BillManagement;
import com.company.model.Room;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class BillView {
    BillManagement billManagement = new BillManagement();

    public void formShowBill (){
        try {
            billManagement.showBill();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void formAddBill (){
        System.out.println("Enter new bill : ");
        System.out.println("Enter check-in time :");
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter end day : ");
        int ci_year = scanner.nextInt();
        System.out.println("Enter month : ");
        int ci_month = scanner.nextInt();
        System.out.println("Enter day : ");
        int ci_day = scanner.nextInt();

        LocalDate checkin = LocalDate.of(ci_year,ci_month,ci_day);

        System.out.println("Enter check-out time :");
        Scanner scanner1 = new  Scanner(System.in);
        System.out.println("Enter end day : ");
        int co_year = scanner1.nextInt();
        System.out.println("Enter month : ");
        int co_month = scanner1.nextInt();
        System.out.println("Enter day : ");
        int co_day = scanner1.nextInt();

        LocalDate checkout = LocalDate.of(co_year, co_month, co_day);

        System.out.println("Enter Staff's name :");
        Scanner scanner2 = new Scanner(System.in);
        String staffName = scanner2.nextLine();
        System.out.println("Enter Costumer's name : " );
        Scanner scanner3 = new Scanner(System.in);
        String costumerName = scanner3.nextLine();



    }


}
//    private Room room;
//    private LocalDate checkin;
//    private LocalDate checkout;
//    private String staffName;
//    private String customerName;