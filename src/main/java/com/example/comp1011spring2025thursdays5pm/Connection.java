package com.example.comp1011spring2025thursdays5pm;

import java.sql.*;

public class Connection {

    public static void main(String[] args) {
        try {
            Connection con = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://172.31.22.43:3306/Benbblanc_previewuser",
                    "Benbblanc_previewuser", "your-password");
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
