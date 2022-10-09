package dataAccess;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void list() {
        //DB erişim kodları
        System.out.println("Hibernate ile instructors listelendi");
    }
}
