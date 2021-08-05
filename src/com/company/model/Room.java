package com.company.model;

import java.time.LocalDate;

public class Room {
    private String roomName;
    private float price;
    private String status;
    private double amountOfBathroom;
    private double getAmountOfBedroom;
    private String id;


    public Room() {
    }

    public Room(String roomName, float price, String status) {
        this.roomName = roomName;
        this.price = price;
        this.status = status;
    }

    public Room(String roomName, float price, String status, double amountOfBathroom, double getAmountOfBedroom) {
        this.roomName = roomName;
        this.price = price;
        this.status = status;
        this.amountOfBathroom = amountOfBathroom;
        this.getAmountOfBedroom = getAmountOfBedroom;

    }

    public Room(String roomName, float price, String status, double amountOfBathroom, double getAmountOfBedroom, String id) {
        this.roomName = roomName;
        this.price = price;
        this.status = status;
        this.amountOfBathroom = amountOfBathroom;
        this.getAmountOfBedroom = getAmountOfBedroom;
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmountOfBathroom() {
        return amountOfBathroom;
    }

    public void setAmountOfBathroom(double amountOfBathroom) {
        this.amountOfBathroom = amountOfBathroom;
    }

    public double getGetAmountOfBedroom() {
        return getAmountOfBedroom;
    }

    public void setGetAmountOfBedroom(double getAmountOfBedroom) {
        this.getAmountOfBedroom = getAmountOfBedroom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
