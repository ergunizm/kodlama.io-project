package core.logging;

public class MailLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Mail gonderildi " + message);
    }
}
