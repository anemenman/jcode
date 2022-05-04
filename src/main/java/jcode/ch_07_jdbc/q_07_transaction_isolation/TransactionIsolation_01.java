package jcode.ch_07_jdbc.q_07_transaction_isolation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TransactionIsolation_01 {
    public static void main(String[] args) throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "pwd");
        cn.setTransactionIsolation(Connection.TRANSACTION_NONE);//0
        cn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);//1
        cn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);//2
        cn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);//4
        cn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);//8
    }
}
