public class CustomerManager {
    private BaseDatabaseManager databaseManager;

    //ctorda vermek yerine private yapmayıp main'de customerManager.database = new ... yapabilirdik
    public CustomerManager(BaseDatabaseManager databaseManager){
        this.databaseManager = databaseManager;
    }

    public void getCustomers(){
        databaseManager.getData();
    }
}
