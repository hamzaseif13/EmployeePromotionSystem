package com.example.employeepromotionsystem.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection;
    private static final DatabaseConnection INSTANCE = new DatabaseConnection();

    private DatabaseConnection() {
        initDB();
    }

    private void initDB() {
        try {
            String URL = "jdbc:mysql://" + "localhost:3306" + "/" + "webproject";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "1253");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error in database connection\n" + e.getMessage());
        }
    }

    public static DatabaseConnection getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }
}
