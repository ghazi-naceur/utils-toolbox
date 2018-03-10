package logger;

import org.apache.log4j.Logger;

public class Log4jLogger{

    static Logger log = Logger.getLogger(Log4jLogger.class.getName());

    public static void main(String[] args){
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    }
}
