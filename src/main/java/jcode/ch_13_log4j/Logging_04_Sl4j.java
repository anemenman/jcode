package jcode.ch_13_log4j;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging_04_Sl4j {
    final static Logger log = LoggerFactory.getLogger(Logging_04_Sl4j.class);

    public static void main(String[] args) {
        log.info("LOG INFO: {}", 1);
        log.error("LOG ERROR: {}", 2);
    }
}
