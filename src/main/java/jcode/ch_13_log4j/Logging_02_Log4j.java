package jcode.ch_13_log4j;

import org.apache.log4j.Logger;

public class Logging_02_Log4j {

    final static Logger log = Logger.getLogger(Logging_02_Log4j.class);

    public static void main(String[] args) {
        log.info("...");
        log.info("...", new Exception("..."));

        log.error("...");
        log.error("", new Exception("..."));

        log.trace("...");
        log.trace("", new Exception("..."));
    }
}
