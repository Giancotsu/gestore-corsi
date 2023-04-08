package com.example.gestorecorsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mariadb://localhost/iscritticorsi?user=root&password=root";
        Connection connect = DriverManager.getConnection(url);

        return connect;
    }
}
