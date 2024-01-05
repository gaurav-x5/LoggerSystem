package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// fr:   logger warm, info, debug, error
//       logging place needs to configurable
//       logging with (message, level)
//       setup current logging level (INFO/ DEBUG)

// nfr : application should not be blocked by this (incase of heavy load);

        Logger logger = LoggerFactory.getLoggerInstance();
        logger.log("hey new logger system", LoggerLevel.DEBUG);
        logger.log("hey new logger system", LoggerLevel.INFO);

    }
}