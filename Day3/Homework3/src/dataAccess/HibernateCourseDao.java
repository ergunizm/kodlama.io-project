package dataAccess;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add() {
        //DB erişim kodları
        System.out.println("Hibernate ile kurs eklendi");
    }
}
