package com.library.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

    	Connection con = null;

    	try {
    	    System.out.println("Trying to connect...");

    	    Class.forName("com.mysql.cj.jdbc.Driver");

    	    con = DriverManager.getConnection(
    	        "jdbc:mysql://127.0.0.1:3306/librarydb?useSSL=false&serverTimezone=UTC",
    	        "root",
    	        "1234"
    	    );

    	    System.out.println("Database Connected Successfully ✅");

    	} catch (Exception e) {
    	    System.out.println("Database Connection Failed ❌");
    	    e.printStackTrace();
    	}

        return con;
    }
}


