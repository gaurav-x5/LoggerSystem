package org.example;

public class LoggerFactory {

    private static volatile Logger logger;

    private LoggerFactory() {
    }

    public static Logger getLoggerInstance() {
        if(logger == null) {
            LoggerOutput loggerOutput = new StandardOutput();
            logger = new InfoLogger(new DebugLogger(null, loggerOutput), loggerOutput);
        }

        return logger;
    }
}


//Tiny URL


// FR :
//1. if we provide a large url we should return a compressed url /tiny url
//2. retain it for lifetime
//3. as less as possible
//4. no collision should happen (should be random enough)


// NFR:
// 1. available
// 2. resilient
// 3. scalable -> 1000 tps -> (write + read)
// 4. latency -> write can be higher / read should be minimum


//API:
// URL tinyURL(URL largeURL);
// URL redirectAPI(URL tinyURL);
// Database:
// SQL DB:

// ID TINYURL URL createTime


// user -> tinyService -> website

// 2 service
// tinyService{  write

// }
// redirect service { read
//}
