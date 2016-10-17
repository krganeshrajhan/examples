package example.design.pattern.behavioral.chain.builder;

import example.design.pattern.behavioral.chain.logger.AbstractLogger;
import example.design.pattern.behavioral.chain.logger.ConsoleLogger;
import example.design.pattern.behavioral.chain.logger.ErrorLogger;
import example.design.pattern.behavioral.chain.logger.FileLogger;

/**
 * Created by 1532082 on 10/17/2016.
 */
public class LoggerBuilder {

    public static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
