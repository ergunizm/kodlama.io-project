public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("İstanbul");

        CustomerManager customerManager1 = new CustomerManager(customer,new MilitaryCreditManager());
        customerManager1.save();

        Company company = new Company();
        company.setId(2);
        company.setCompanyName("Asd");
        company.setTaxNumber("123456");

        CustomerManager customerManager2 = new CustomerManager(company,new TeacherCreditManager());
        customerManager2.giveCredit();
    }
}