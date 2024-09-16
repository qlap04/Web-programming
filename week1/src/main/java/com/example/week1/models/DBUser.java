package com.example.week1.models;

import java.sql.ResultSet;

public class DBUser {
    private DAL dal;

    public DBUser() {
        dal = new DAL();
    }

    public ResultSet getListUsers() {
        return dal.getData("SELECT * FROM products");
    }

    // Phương thức đóng kết nối trong DBUser
    public void closeConnection() {
        dal.closeConnection();
    }
}
