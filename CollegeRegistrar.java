import java.util.ArrayList;
/**
 * Write a description of class CollegeRegistrar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeRegistrar
{
    private ArrayList<Registration> courseRegistrations;

    /**
     * Constructor for objects of class CollegeRegistrar
     */
    public CollegeRegistrar()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addRegistration(Registration newRegistration)
    {
        // put your code here
        
    }
    
    public void printAllRegistrations()
    {
        // prints for all registrations the corresponding info
        // registration records are separated by an empty line
    }
    
    public void printClassesForStudent(String student)
    {
        // prints all classes (course number and professor) in which the 
        // student is enrolled
        // one class per line
    }
    
    public int getClassCountForStudent(String student)
    {
        // number of classes in which the student is enrolled
        return 0;
    }
    
    public void printClassesForStudentByProfessor(String student, String professor)
    {
        // prints all classes (course number and section) 
        // tought by professor and taken by student
        // one class per line
    }
    
    public void printClassesForStudentInSlot(String student, int timeSlot)
    {
        // prints all classes (course number and section)
        // taken by student in timeSlot
        // one class per line
    }
    
    public int getRegistrationsInClass(String classNumber)
    {
        // get the number of students registered in classNumber
        return 0;
    }
    
    public int getRegistrationsInClass(String classNumber, int timeSlot)
    {
        // get the number of students enrolled in classNumber and slot
        return 0;
    }
    
    public int studentsTakingClassesInSlot(int timeSlot)
    {
        // get the number of students taking classes in timeSlot
        return 0;
    }
    
    public void dropClassForStudent(String classNumber, String student)
    {
        // drops class classNumber for student
    }
    
    public void dropAllClassesForStudent(String student)
    {
        // drops all classes for student
    }
}
