package core.logging;

public class ConsoleLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Console loglandı " + message);
    }
}
