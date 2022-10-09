public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger baseLogger){
        this.logger = baseLogger;
    }

    public void add(){
        System.out.println("Müşteri ekleme operasyonları...");
        logger.log("Müşteri eklendi!");
    }
}
