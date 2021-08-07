package com.company.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Bill implements Serializable {

    private LocalDate checkin;
    private LocalDate checkout;
    private String staffName;
    private String customerName;
    private float totalPrice;
    private String billId;
    private Room room;

    public Bill() {
    }


    public Bill(LocalDate checkin, LocalDate checkout, String staffName, String customerName, String billId) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.staffName = staffName;
        this.customerName = customerName;
        this.billId = billId;
    }

    public Bill(LocalDate checkin, LocalDate checkout, String staffName, String customerName, float totalPrice, String billId, Room room) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.staffName = staffName;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.billId = billId;
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "room=" + room.getRoomName() +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                ", staffName='" + staffName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalPrice=" + totalPrice +
                ", billId='" + billId + '\'' +
                '}';
    }
}

