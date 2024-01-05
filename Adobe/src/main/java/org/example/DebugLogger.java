package org.example;

public class DebugLogger extends Logger{
    public DebugLogger(Logger logger, LoggerOutput loggerOutput) {
        super(logger, loggerOutput);
    }

    public void log(String message, LoggerLevel loggerLevel) {
        if(loggerLevel == LoggerLevel.DEBUG) {
            System.out.println("DEBUG : " + message);
        } else{
            logger.log(message, loggerLevel);
        }
    }
}
