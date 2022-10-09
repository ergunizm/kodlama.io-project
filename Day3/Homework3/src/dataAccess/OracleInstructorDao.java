package dataAccess;

public class OracleInstructorDao implements InstructorDao{
    @Override
    public void list() {
        //DB erişim kodları
        System.out.println("Oracle ile instructors listelendi");
    }
}
