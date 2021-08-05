package com.company.storage;

import com.company.model.Bill;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BillFileManagement {
    public static void writeFile(List<Bill> billList) throws IOException {
        FileOutputStream fos = new FileOutputStream("BillManagement.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(billList);
        oos.close();
        fos.close();
    }

    public static List<Bill> readFile() throws IOException, ClassNotFoundException {
        List<Bill> billList = new ArrayList<>();
        File file = new File("BillManagement.txt");
        if (file.length() > 0) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            billList = (List<Bill>) o;
            ois.close();
            fis.close();
        }
        return billList;
    }
}