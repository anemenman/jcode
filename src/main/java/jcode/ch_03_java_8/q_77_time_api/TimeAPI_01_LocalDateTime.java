package jcode.ch_03_java_8.q_77_time_api;

import java.time.LocalDateTime;

public class TimeAPI_01_LocalDateTime {

  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    LocalDateTime localDateTime2 = localDateTime.plusDays(10);
    System.out.println(localDateTime2);
  }

}
