import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.ConsoleLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.*;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ILogger[] loggers = {new FileLogger(),new MailLogger(),new ConsoleLogger()};
        //Course
        Course course1 = new Course(1,"Java2020",100);
        Course course2 = new Course(2,"Java2022",500);
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);

        CourseManager courseManager = new CourseManager(courses,new JdbcCourseDao(),loggers);

        courseManager.add(new Course(5,"Java 2022",100));

        //Category
        Category[] categories = new Category[]{new Category("Backend"),new Category("Frontend")};

        CategoryManager categoryManager = new CategoryManager(categories,new JdbcCategoryDao(),loggers);
        categoryManager.add(new Category("B ackend"));

        //Instructor
        Instructor[] instructors = new Instructor[]{new Instructor("Engin","Demirog"),new Instructor("Ergun","Izmirlioglu")};

        InstructorManager instructorManager = new InstructorManager(new OracleInstructorDao(),loggers);
        instructorManager.listAll(instructors);
    }
}