package com.main.java.bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/car_tires?useUnicode=true&serverTimezone=UTC";
    public static final String DB_Driver = "com.mysql.jdbc.Driver";

    static final String USER = "root";
    static final String PASS = "root";

    public Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(DB_Driver);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Ok");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection ERROR");
        }
        return connection;
    }
}