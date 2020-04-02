package jcode.ch_03_java_8.q_77_time_api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class TimeAPI_06_current_local_time_by_zone {

  public static void main(String[] args) {
    System.out.println(
        "LocalDateTime--->" + LocalDateTime
            .ofInstant(new Date().toInstant(), ZoneId.systemDefault()));
  }

}
