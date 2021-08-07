package com.company.controller;

import com.company.model.User;
import com.company.storage.UserFileManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    List<User> userList = new ArrayList<>();
    String managerName;

    public UserManagement() {
    }

    public UserManagement(List<User> userList, String managerName) {
        this.userList = userList;
        this.managerName = managerName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void showUserList() throws IOException, ClassNotFoundException {
        userList = UserFileManagement.readFile();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).toString());
        }
    }

    public void addUser(User newUser) throws IOException {
        userList.add(newUser);
        UserFileManagement.writeFile(userList);

    }

    public int findUserByAccount(String account) {
        int index = -1;
        for (int i = 0; i < userList.size(); i++) {
            if (account.equals(userList.get(i).getAccount())) {
                index = i;
            }
        }
        return index;
    }

    public void editUser(int index, User editUser) throws IOException {
        userList.set(index, editUser);
        UserFileManagement.writeFile(userList);
    }

    public void deleteUser(int index) throws IOException {
        userList.remove(index);
        UserFileManagement.writeFile(userList);
    }

}
