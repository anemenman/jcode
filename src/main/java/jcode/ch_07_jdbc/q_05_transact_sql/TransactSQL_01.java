package jcode.ch_07_jdbc.q_05_transact_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactSQL_01 {
    public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "pwd");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("{call GETCASTNAME}");
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
