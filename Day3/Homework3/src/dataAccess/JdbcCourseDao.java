package dataAccess;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add() {
        // DB erişim kodları
        System.out.println("JDBC ile kurs eklendi");
    }
}
