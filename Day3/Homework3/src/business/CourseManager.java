package business;

import core.logging.ILogger;
import dataAccess.CourseDao;
import entities.Course;
import java.util.ArrayList;

public class CourseManager {
    private CourseDao courseDao;
    private ArrayList<Course> courses;
    private ILogger[] loggers;

    public CourseManager(ArrayList<Course> courses, CourseDao courseDao,ILogger[] loggers){
        this.courses = courses;
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course newCourse) throws Exception {
        for(Course course:courses){
            if(newCourse.getName() == course.getName()){
                throw new Exception("Ayni isimde kurs girilemez!");
            }
            for(ILogger logger:loggers){
                logger.log(course.getName());
            }
        }

        if(newCourse.getPrice()<0){
            throw new Exception("Kursun fiyatı 0'dan küçük olamaz!");
        }
        courseDao.add();
    }
}
