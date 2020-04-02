package jcode.ch_03_java_8.q_77_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TimeAPI_04_next_tuesday {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
    System.out.println(localDate);
  }
}
