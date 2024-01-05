package org.example;

public abstract class Logger {

    Logger logger;

    LoggerOutput loggerOutput;

    public Logger(Logger logger, LoggerOutput loggerOutput) {
        this.logger = logger;
        this.loggerOutput = loggerOutput;
    }

    public void log(String message, LoggerLevel loggerLevel) {
        logger.log(message, loggerLevel);
    }

    public void setLoggerOutput(LoggerOutput loggerOutput) {
        this.loggerOutput = loggerOutput;
    }
}
