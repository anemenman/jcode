package jcode.ch_03_java_8.q_77_time_api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeAPI_03_LocalDate {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);

    System.out.println(localDate.plus(1, ChronoUnit.DAYS));
    System.out.println(localDate.plus(1, ChronoUnit.YEARS));

  }
}
