package org.example;

public class InfoLogger extends Logger{


    public InfoLogger(Logger logger, LoggerOutput loggerOutput) {
        super(logger, loggerOutput);
    }

    public void log(String message, LoggerLevel loggerLevel) {
        if(loggerLevel == LoggerLevel.INFO) {
            System.out.println("INFO : " + message);
        } else{
            logger.log(message, loggerLevel);
        }
    }
}
