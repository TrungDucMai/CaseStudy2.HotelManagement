package com.company.controller;

import com.company.model.Room;
import com.company.model.RoomType;
import com.company.storage.RoomFileManagement;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RoomManagement {
    private List<Room> roomList = new ArrayList<>();
    private String managerName;

    public RoomManagement() {
    }

    public RoomManagement(List<Room> roomList, String managerName) {
        this.roomList = roomList;
        this.managerName = managerName;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }


    // Them phong can validate
    public void addNewRoom(Room newRoom) throws IOException {
        roomList.add(newRoom);
        RoomFileManagement.writeFile(roomList);
    }

    public void showRoomList() throws IOException, ClassNotFoundException {
        roomList = RoomFileManagement.readFile();
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println(roomList.get(i).toString());
        }
    }


    public void checkRoom(String roomName, LocalDate startTime, LocalDate endTime) {
        BillManagement bill = new BillManagement();
        for (int i = 0; i < bill.getBillList().size(); i++) {

            if (roomName.equals(bill.getBillList().get(i).getRoom().getRoomName())) {
                if (startTime.isBefore(bill.getBillList().get(i).getCheckin()) && endTime.isBefore(bill.getBillList().get(i).getCheckin()) || startTime.isAfter(bill.getBillList().get(i).getCheckout()) && endTime.isAfter(bill.getBillList().get(i).getCheckout())) {
                    System.out.println("The room is empty ");
                }

            } else {
                System.out.println("The room is not available  from " + bill.getBillList().get(i).getCheckin() + " till " + bill.getBillList().get(i).getCheckout());
            }
        }

    }

    public void searchRoomByPrice(float lowestPrice, float highestPrice) throws IOException {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getPrice() >= lowestPrice && roomList.get(i).getPrice() <= highestPrice) {
                System.out.println(roomList.get(i));

            } else {
                System.out.println("Can't find any room in the price's range ");
            }
        }
    }

    public int findRoomById(String id) {
        int index = -1;
        for (int i = 0; i < roomList.size(); i++) {
            if (id.equals(roomList.get(i).getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Room findAvailableRoom(String roomName) {
        Room room = null;
        for (Room r : roomList
        ) {
            if (r.getRoomName().equals(roomName)){
                room = r;
        }
    }
        return room;
}

    // Sua phong can validate
    public void editRoom(int index, Room newRoom) throws IOException {
        roomList.set(index, newRoom);
        RoomFileManagement.writeFile(roomList);
    }

    public void deleteRoom(int index) throws IOException {
        roomList.remove(index);
        RoomFileManagement.writeFile(roomList);
    }

}