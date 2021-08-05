package com.company.view;

import com.company.controller.RoomManagement;
import com.company.model.Room;
import com.company.model.RoomType;
import com.company.storage.RoomFileManagement;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public  class  RoomView {

    RoomManagement roomManagement = new RoomManagement();


    public void formShowRoomList() {
        try {
            roomManagement.showRoomList();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void formSearchRoomByPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lowest price :");
        float lowestPrice = scanner.nextFloat();
        System.out.println("Enter highest price :");
        float highestPrice = scanner.nextFloat();
        try {
            roomManagement.searchRoomByPrice(lowestPrice, highestPrice);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void formAddRoom() {
        System.out.println("Enter new room info : ");
        System.out.println("Enter room's name : ");
        Scanner scanner = new Scanner(System.in);
        String roomName = scanner.nextLine();
        System.out.println("Enter room's price : ");
        Scanner scanner1 = new Scanner(System.in);
        float price = scanner1.nextFloat();
        System.out.println("Enter room's status : ");
        Scanner scanner2 = new Scanner(System.in);
        String status = scanner2.nextLine();
        System.out.println("Enter amount of bathroom : ");
        Scanner scanner3 = new Scanner(System.in);
        double bathroom = scanner3.nextDouble();
        System.out.println("Enter amount of bedroom : ");
        Scanner scanner4 = new Scanner(System.in);
        double bedroom = scanner4.nextDouble();
        System.out.println("Enter room's ID : ");
        Scanner scanner5 = new Scanner(System.in);
        String id = scanner5.nextLine();
        Room newRoom = new Room(roomName, price, status, bathroom,bedroom,id);

        try {
            roomManagement.addNewRoom(newRoom);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void formEditRoom() {
        System.out.println("Enter room's ID : ");
        Scanner scanner = new Scanner(System.in);
        String searchId = scanner.nextLine();
        int index = roomManagement.findRoomById(searchId);

        System.out.println("Enter room's info : ");
        System.out.println("Enter room's name");
        Scanner scanner1 = new Scanner(System.in);
        String roomName = scanner1.nextLine();
        System.out.println("Enter room's price : ");
        Scanner scanner2 = new Scanner(System.in);
        float price = scanner2.nextFloat();
        System.out.println("Change room's status : ");
        Scanner scanner3 = new Scanner(System.in);
        String status = scanner3.nextLine();
        System.out.println("Enter amount of bathroom : ");
        Scanner scanner4 = new Scanner(System.in);
        double bathroom = scanner4.nextDouble();
        System.out.println("Enter amount of bedroom : ");
        Scanner scanner5 = new Scanner(System.in);
        double bedroom = scanner5.nextDouble();
        System.out.println("Enter room's ID : ");
        Scanner scanner6 = new Scanner(System.in);
        String id = scanner6.nextLine();

        Room editRoom = new Room(roomName, price, status, bathroom, bedroom, id);


        try {
            roomManagement.editRoom(index, editRoom);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void formCheckRoom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start day : ");
        System.out.println("Enter year : ");
        int syear = scanner.nextInt();
        System.out.println("Enter month : ");
        int smonth = scanner.nextInt();
        System.out.println("Enter day : ");
        int sday = scanner.nextInt();

        LocalDate startTime = LocalDate.of(syear, smonth, sday);

        System.out.println("Enter end day : ");
        System.out.println("Enter year : ");
        int eyear = scanner.nextInt();
        System.out.println("Enter month : ");
        int emonth = scanner.nextInt();
        System.out.println("Enter day : ");
        int eday = scanner.nextInt();

        LocalDate endTime = LocalDate.of(eyear, emonth, eday);

        System.out.println("Enter room's name : ");
        Scanner scanner1 =new Scanner(System.in);
        String roomName = scanner1.nextLine();

        roomManagement.checkRoom(roomName, startTime, endTime);

    }

}