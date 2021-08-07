package com.company.controller;

import com.company.model.Bill;
import com.company.model.Room;
import com.company.storage.BillFileManagement;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BillManagement {
    private List<Bill> billList = new ArrayList<>();
    private String billManagerName;

    public BillManagement() {
    }

    public BillManagement(List<Bill> billList, String billManagerName) {
        this.billList = billList;
        this.billManagerName = billManagerName;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public String getBillManagerName() {
        return billManagerName;
    }

    public void setBillManagerName(String billManagerName) {
        this.billManagerName = billManagerName;
    }

    public void addNewBill(Bill newBill) throws IOException {
        billList.add(newBill);
        BillFileManagement.writeFile(billList);
    }


    public void showBill() throws IOException, ClassNotFoundException {
        billList = BillFileManagement.readFile();
        for (int i = 0; i < billList.size(); i++) {
            System.out.println(billList.get(i).toString());

        }
    }
    public int findBillById (String id){
        int index = -1;
        for (int i = 0; i < billList.size(); i++) {
            if (id.equals(billList.get(i).getBillId())){
                index = i;
            }
        } return index;
    }

    public void editBill( int index, Bill newBill) throws IOException {
        billList.set(index, newBill);
        BillFileManagement.writeFile(billList);
    }
    public void deleteBill ( int index ) throws IOException {
        billList.remove(index);
        BillFileManagement.writeFile(billList);
    }
}
