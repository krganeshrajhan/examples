package example.design.pattern.behavioral.chain;

import example.design.pattern.behavioral.chain.builder.LoggerBuilder;
import example.design.pattern.behavioral.chain.logger.AbstractLogger;
import example.design.pattern.behavioral.chain.logger.ConsoleLogger;
import example.design.pattern.behavioral.chain.logger.ErrorLogger;
import example.design.pattern.behavioral.chain.logger.FileLogger;

/**
 * Created by 1532082 on 9/16/2016.
 */
public class ChainPatternDemo {

    public static void main(String [] args) {

        AbstractLogger loggerChain = LoggerBuilder.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");

    }
}
