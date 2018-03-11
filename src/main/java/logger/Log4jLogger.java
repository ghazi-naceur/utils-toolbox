package logger;

import org.apache.log4j.Logger;

public class Log4jLogger{

    static Logger LOGGER = Logger.getLogger(Log4jLogger.class.getName());

    public static void main(String[] args){
        LOGGER.debug("Hello this is a debug message");
        LOGGER.info("Hello this is an info message");
    }
}
