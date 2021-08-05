package com.company.storage;

import com.company.model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomFileManagement {
    public static void  writeFile(List<Room> roomList) throws IOException {
        FileOutputStream fos = new FileOutputStream("RoomManagement.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(roomList);
        oos.close();
        fos.close();
    }

    public static List<Room> readFile() throws IOException, ClassNotFoundException {
        List<Room> roomList = new ArrayList<>();
        File file = new File("RoomManagement.txt");
        if(file.length()>0){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            roomList = (List<Room>) o;
            ois.close();
            fis.close();
        }
        return roomList;
    }
}
