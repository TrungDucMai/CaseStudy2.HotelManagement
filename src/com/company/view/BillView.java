package com.company.view;

import com.company.controller.BillManagement;
import com.company.controller.RoomManagement;
import com.company.model.Bill;
import com.company.model.Room;
import com.company.storage.RoomFileManagement;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class BillView {
    BillManagement billManagement = new BillManagement();

    public void formShowBill() {
        try {
            billManagement.showBill();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void formAddBill() {
        System.out.println("Enter new bill : ");
        System.out.println("Enter check-in time :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter end day : ");
        int ci_year = scanner.nextInt();
        System.out.println("Enter month : ");
        int ci_month = scanner.nextInt();
        System.out.println("Enter day : ");
        int ci_day = scanner.nextInt();

        LocalDate checkin = LocalDate.of(ci_year, ci_month, ci_day);

        System.out.println("Enter check-out time :");
        Scanner scanner1 = new Scanner(System.in);
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
        System.out.println("Enter Costumer's name : ");
        Scanner scanner3 = new Scanner(System.in);
        String customerName = scanner3.nextLine();
        System.out.println("Enter bill's ID : ");
        Scanner scanner4 = new Scanner(System.in);
        String id = scanner4.nextLine();

        Bill newBill = new Bill(checkin, checkout, staffName, customerName, id);

        System.out.println("Enter room's name : ");
        Scanner scanner5 = new Scanner(System.in);
        String roomName = scanner5.nextLine();
        RoomManagement roomManagement = new RoomManagement();
        Room room = roomManagement.findAvailableRoom(roomName);
        if (room != null) {
            newBill.setRoom(room);
        } else {
            System.out.println("Cant add the room");
        }


        room.setStatus("Booked");
        int roomIndex = roomManagement.findRoomById(room.getId());
        try {
            roomManagement.editRoom(roomIndex, room);
        } catch (IOException e) {
            e.printStackTrace();
        }
        float totalPrice = (checkout.toEpochDay() - checkin.toEpochDay()) * room.getPrice();
        newBill.setTotalPrice(totalPrice);

        try {
            billManagement.addNewBill(newBill);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void formdeleteBill() {
        System.out.println("Enter bill's ID : ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        int index = billManagement.findBillById(id);
        try {
            billManagement.deleteBill(index);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void formEditBill(){
        System.out.println("Enter new bill : ");
        System.out.println("Enter check-in time :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter end day : ");
        int ci_year = scanner.nextInt();
        System.out.println("Enter month : ");
        int ci_month = scanner.nextInt();
        System.out.println("Enter day : ");
        int ci_day = scanner.nextInt();

        LocalDate checkin = LocalDate.of(ci_year, ci_month, ci_day);

        System.out.println("Enter check-out time :");
        Scanner scanner1 = new Scanner(System.in);
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
        System.out.println("Enter Costumer's name : ");
        Scanner scanner3 = new Scanner(System.in);
        String customerName = scanner3.nextLine();
        System.out.println("Enter bill's ID : ");
        Scanner scanner4 = new Scanner(System.in);
        String id = scanner4.nextLine();

        Bill newBill = new Bill(checkin, checkout, staffName, customerName, id);

        System.out.println("Enter room's name : ");
        Scanner scanner5 = new Scanner(System.in);
        String roomName = scanner5.nextLine();
        RoomManagement roomManagement = new RoomManagement();
        Room room = roomManagement.findAvailableRoom(roomName);
        if (room != null) {
            newBill.setRoom(room);
        } else {
            System.out.println("Cant add the room");
        }

        System.out.println("Enter room's status :");
        Scanner scanner6 = new Scanner(System.in);
        String status = scanner6.nextLine();
        room.setStatus(status);
        int roomIndex = roomManagement.findRoomById(room.getId());
        try {
            roomManagement.editRoom(roomIndex, room);
        } catch (IOException e) {
            e.printStackTrace();
        }
        float totalPrice = (checkout.toEpochDay() - checkin.toEpochDay()) * room.getPrice();
        newBill.setTotalPrice(totalPrice);

        try {
            billManagement.editBill(roomIndex, newBill);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
