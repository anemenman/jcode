package jcode.ch_03_java_8.q_77_time_api;

import java.util.Date;

public class TimeAPI_05_date_time_in_milliseconds {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println("date.getTime()--->" + date.getTime());
    System.out.println("date.toInstant()--->" + date.toInstant());
  }
}
