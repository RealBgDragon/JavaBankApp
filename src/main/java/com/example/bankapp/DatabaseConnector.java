package com.example.bankapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static DatabaseConnector instance;

    private Connection connection;

    //Database info
    private final String url = "jdbc:mysql://localhost:3306/bankdb";
    private final String user = "root";
    private final String password = "Ladasamara1_";

    private DatabaseConnector() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("Could not connect to database");
            e.printStackTrace();
        }
    }

    // Provide the singleton instance
    public static DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    // Return the db connection
    public Connection getConnection() {
        return connection;
    }

    // Close the connection
    public void closeConnection() {
        try{
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            System.out.println("Could not close connection");
            e.printStackTrace();
        }
    }

}
