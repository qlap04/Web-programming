package com.example.week1.controllers;

import com.example.week1.models.DBUser;
import com.example.week1.models.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/products"})
public class DisplayUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DisplayUser() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBUser dbUser = new DBUser();
        ResultSet rs = dbUser.getListUsers();

        List<Product> productList = new ArrayList<>();

        try {
            while (rs.next()) {
                String name = rs.getString("name");
                String factory = rs.getString("factory");
                int price = rs.getInt("price");

                Product product = new Product(name, factory, price);
                productList.add(product);
                System.out.println(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUser.closeConnection();
        }

        req.setAttribute("productList", productList);
        req.getRequestDispatcher("product.jsp").forward(req, resp);
    }
}