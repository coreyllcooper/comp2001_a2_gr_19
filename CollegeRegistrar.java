import java.util.ArrayList;
import java.util.*;
import java.util.Random;

/**
 * CollegRegistrar is essentially a wrapper around an ArrayList that provides methods to manage
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeRegistrar
{
    private ArrayList<Registration> courseRegistrations = new ArrayList<>();

    /**
     * Constructor for objects of class CollegeRegistrar
     */
    public CollegeRegistrar()
    {
        //empty constructor
    }

    public void populateRegistrations(){
        //Creates 30 random Registration objects and adds them to the courseRegistrations ArrayList

        String[] courses = {"COMP 1501", "ENGL 2201", "CHEM 3060", "PHYS 2344", "ENGL 2005", "COMP 2704", "PHYS 2377", "CHEM 4927", "COMP 3444"};
        String[] names = {"Nora", "Manpreet", "Ila","Jacob","Abhinav","Joanna","Patti","Avineet","Fen","Esteban","Nina","Braeden","Chhamandeep","Michael","Chelsea","Baozhai"};
        String[] profs = {"Fiech", "Xiang","Kolokolova","Wareham","Tang","Bazhaf","Mata-Montero","Miminis","Gupta"};
        for(int i = 0; i < 30; i++){
            int randomSlot = (int)Math.floor(Math.random()*(25-12+1)+12);
            int randomSection = (int)Math.floor(Math.random()*(2-0+1)+0);
            int randomCourseIndex = (int)Math.floor(Math.random()*(courses.length-1));
            int randomNameIndex = (int)Math.floor(Math.random()*(names.length-1));
            int randomProfIndex = (int)Math.floor(Math.random()*(profs.length-1));
            Registration tempRegistration = new Registration(courses[randomCourseIndex],randomSection,randomSlot,names[randomNameIndex],profs[randomProfIndex]);
            courseRegistrations.add(tempRegistration);

        }
    }
    
    public void addRegistration(Registration newRegistration)
    {
        //Takes a Registration object as a parameter and adds it to the courseRegistrations ArrayList
        courseRegistrations.add(newRegistration);

    }

    public void printAllRegistrations()
    {
        // prints for all registrations the corresponding info
        // registration records are separated by an empty line
        courseRegistrations.stream()
        .forEach((registration) ->
            {
                registration.printInfo();
            }
        );

    }

    public void printClassesForStudent(String student)
    {
        // prints all classes (course number and professor) in which the 
        // student is enrolled
        // one class per line

        courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .forEach(registration -> registration.printInfo()); // prints info about each class in the stream

    }

    public int getClassCountForStudent(String student)
    {

        return (int)courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .count(); // counts the number of classes in the stream
    }

    public void printClassesForStudentByProfessor(String student, String professor)
    {
        // prints all classes (course number and section) 
        // tought by professor and taken by student
        // one class per line
        courseRegistrations.stream()    // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .filter(registration -> registration.getProfessor().equals(professor)) // filters by professor name
        .forEach(registration -> registration.printInfo()); // prints info about each class in the stream
    }

    public void printClassesForStudentInSlot(String student, int timeSlot)
    {
        // prints all classes (course number and section)
        // taken by student in timeSlot
        // one class per line
        courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .filter(registration -> registration.getTimeSlot() == timeSlot) // filters by professor name
        .forEach(registration -> registration.printInfo()); // prints info about each class in the stream
    }

    public int getRegistrationsInClass(String classNumber)
    {
        // number of classes in which the student is enrolled
        return (int)courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getCourseNumber().equals(classNumber)) // filters by course number
        .count(); // counts the number of courses in the stream
    }

    public int getRegistrationsInClass(String classNumber, int timeSlot)
    {
        // get the number of students enrolled in classNumber and slot
        return (int)courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getCourseNumber().equals(classNumber)) // filters by class number
        .filter(registration -> registration.getTimeSlot() == timeSlot) // filters by time slot
        .count(); 
    }

    public int studentsTakingClassesInSlot(int timeSlot)
    {
        // get the number of students taking classes in timeSlot
        return (int) courseRegistrations.stream()    // creates a stream of registered classes
        .filter(registration -> registration.getTimeSlot() ==(timeSlot)) // filters by time slot
        .count();
    }

    public void dropClassForStudent(String classNumber, String student)
    {
        //given a course/class number and a student name as a string, uses the removeIf method to remove the given Registration object from the courseRegistration ArrayList

        courseRegistrations.removeIf(registration -> ((registration.getCourseNumber().equals(classNumber)) && (registration.getStudent().equals(student)))); 
    }

    public void dropAllClassesForStudent(String student)
    {
        //given a student number as a string, uses the removeIf method to remove the all Registration object with the matching student attribute from the courseRegistration ArrayList
        courseRegistrations.removeIf(registration -> (registration.getStudent().equals(student)));

    }
}

