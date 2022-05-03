package jcode.ch_07_jdbc.q_03_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_01 {
    public static void main(String[] args) throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "pwd");
    }
}
