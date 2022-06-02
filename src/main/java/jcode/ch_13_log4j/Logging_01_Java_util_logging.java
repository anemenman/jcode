package jcode.ch_13_log4j;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Logging_01_Java_util_logging {
    static Logger log = Logger.getLogger(Logging_01_Java_util_logging.class.getName());

    static Logger log2;

    static {
        try (FileInputStream ins = new FileInputStream("./Logging_01_Java_util_logging.config")) { //полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(ins);
            log2 = Logger.getLogger("Logger2");
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {
        log.log(Level.INFO, "...");
    }
}
