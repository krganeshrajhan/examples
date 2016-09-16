package example.design.pattern.behavioral.chain.logger;

/**
 * Created by 1532082 on 9/16/2016.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
