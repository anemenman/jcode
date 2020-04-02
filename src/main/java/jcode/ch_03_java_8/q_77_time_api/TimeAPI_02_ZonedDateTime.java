package jcode.ch_03_java_8.q_77_time_api;

import java.time.ZonedDateTime;

public class TimeAPI_02_ZonedDateTime {

  public static void main(String[] args) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);

    ZonedDateTime zonedDateTime2 = zonedDateTime.plusDays(10);
    System.out.println(zonedDateTime2);
  }

}
