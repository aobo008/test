package com.test.javalog;

import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.util.logging.*;

/**
 * Created by wanggy on 2017/11/1.
 */
public class Test_Java_Util_Logging_Logger {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger("lavasoft");
        log.setLevel(Level.INFO);
        Logger log1 = Logger.getLogger("lavasoft");
        System.out.println(log == log1);     //true
        Logger log2 = Logger.getLogger("lavasoft.blog");

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        log.addHandler(consoleHandler);
        FileHandler fileHandler = new FileHandler("D:/app/logs/java_util_logging_%g.log");
        fileHandler.setLevel(Level.INFO);
        fileHandler.setFormatter(new MyLogHander());
        log.addHandler(fileHandler);

        log.info("aaa");
        log2.info("bbb");
        log2.fine("fine");
    }

    static class MyLogHander extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + ":" + record.getMessage() + "\n";
        }
    }
}

