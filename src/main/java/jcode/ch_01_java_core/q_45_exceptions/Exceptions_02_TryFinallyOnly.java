package jcode.ch_01_java_core.q_45_exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Exceptions_02_TryFinallyOnly {

    public static void main(String[] args) {

        try {
            System.out.println("start try...");
            throw new RuntimeException("exception...");
        } finally {
            System.out.println("finally");
        }


    }

    public static int i() {

//      try {
        String x = null;
        System.out.print(x.toString() + " ");//только варнинг
//      } finally {
//        System.out.print("finally ");
//      }

        try {
            io();
            sql();
        } catch (IOException | SQLException e) {//перехват нескольких исключний начиная с java 7
            return 1;
        } finally {
            return 2;
        }
    }

    public static void io() throws IOException {
        throw new IOException();
    }

    public static void sql() throws SQLException {
        throw new SQLException();
    }

    public static void readFromFile() throws IOException {
        System.out.print("Reading line ");

//    try {
//
//    } catch (IOException e) { //Compilation error!!!
//      System.out.println("In the IOException catch block");
//    }
    }
}
