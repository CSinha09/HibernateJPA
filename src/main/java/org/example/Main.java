package org.example;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;

        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            if (connection != null) {
                System.out.println("Connection established");
            } else {
                System.out.println("Not established");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}