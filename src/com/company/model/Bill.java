package com.company.model;

import java.time.LocalDate;

public class Bill {
    private Room room;
    private LocalDate checkin;
    private LocalDate checkout;
    private String staffName;
    private String customerName;

    public Bill() {
    }

    public Bill(Room room, LocalDate checkin, LocalDate checkout, String staffName, String customerName) {
        this.room = room;
        this.checkin = checkin;
        this.checkout = checkout;
        this.staffName = staffName;
        this.customerName = customerName;
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
}
