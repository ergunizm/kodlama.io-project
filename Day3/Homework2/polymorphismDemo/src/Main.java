public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();
    }
}