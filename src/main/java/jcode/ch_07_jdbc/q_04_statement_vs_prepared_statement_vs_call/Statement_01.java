package jcode.ch_07_jdbc.q_04_statement_vs_prepared_statement_vs_call;

import java.sql.*;

public class Statement_01 {
    public static void main(String[] args) throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "pwd");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SQL...");
    }
}
