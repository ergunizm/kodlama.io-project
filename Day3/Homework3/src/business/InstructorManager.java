package business;

import core.logging.ILogger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private ILogger[] loggers;

    public InstructorManager(InstructorDao instructorDao,ILogger[] loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void listAll(Instructor[] instructors){
        for(Instructor instructor:instructors){
            System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
            for(ILogger logger:loggers){
                logger.log(instructor.getFirstName()+ " "+instructor.getLastName());
            }
        }
        instructorDao.list();
    }
}
