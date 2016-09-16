package example.design.pattern.behavioral.chain.logger;

/**
 * Created by 1532082 on 9/16/2016.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
