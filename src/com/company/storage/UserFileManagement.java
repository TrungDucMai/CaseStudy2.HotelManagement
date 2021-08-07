package com.company.storage;

import com.company.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFileManagement {
    public static void writeFile(List<User> userList) throws IOException {
        FileOutputStream fos = new FileOutputStream("UserManagement.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(userList);
        oos.close();
        fos.close();

    }

    public static List<User> readFile() throws IOException, ClassNotFoundException {
        List<User> userList = new ArrayList<>();
        File file = new File("UserManagement.txt");
        if (file.length() > 0) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            userList = (List<User>) o;
            ois.close();
            fis.close();
        }
        return userList;
    }
}


