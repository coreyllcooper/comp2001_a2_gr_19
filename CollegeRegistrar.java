import java.util.ArrayList;
import java.util.Random;


/**
 * Write a description of class CollegeRegistrar here.
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
        //These are just demo Registration objects that are instantiated with the class so we can test our methods. We can remove this later.

        Registration LenComp = new Registration("COMP 1501",1,17,"Len","Fiech");
        Registration AdamComp = new Registration("COMP 2704",0,20,"Adam","Xiang");
        Registration CoreyComp = new Registration("COMP 3444",2,21,"Corey","Kolokolova");
        courseRegistrations.add(LenComp);
        courseRegistrations.add(AdamComp);
        courseRegistrations.add(CoreyComp);

       
    }
    public void populateRegistrations(){
        
        
        
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

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addRegistration(Registration newRegistration)
    {
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
<<<<<<< HEAD
<<<<<<< HEAD


        //courseRegistrations.stream()    // creates a stream of student registration
        //.filter(registration -> registration.getStudent().equals(student)) // loops over each courseNumber in stream
        //.forEach(registration -> registration.printInfo()); // prints courseNumber and professor for all courses

        courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .forEach(registration -> registration.printInfo()); // prints info about each class in the stream

=======
        courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .forEach(registration -> registration.printInfo()); // prints info about each class in the stream
>>>>>>> 477bda31328fedde65fb7cea131c8828d8da2e35
=======
        courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .forEach(registration -> registration.printInfo()); // prints info about each class in the stream
>>>>>>> dda5e29f704555960415ffa95a9c9688f089b77f
    }

    public int getClassCountForStudent(String student)
    {
        // number of classes in which the student is enrolled
<<<<<<< HEAD
<<<<<<< HEAD


        //return (int)courseRegistrations.stream()
        //.filter(registration -> registration.getStudent().equals(student))
        //.count();  

        return (int)courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .count(); // counts the number of classes in the stream


=======
        return (int)courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .count(); // counts the number of classes in the stream
>>>>>>> 477bda31328fedde65fb7cea131c8828d8da2e35
=======
        return (int)courseRegistrations.stream() // creates a stream of registered classes
        .filter(registration -> registration.getStudent().equals(student)) // filters by student name
        .count(); // counts the number of classes in the stream
>>>>>>> dda5e29f704555960415ffa95a9c9688f089b77f
    }
<<<<<<< HEAD

=======
    
<<<<<<< HEAD
>>>>>>> 477bda31328fedde65fb7cea131c8828d8da2e35
=======
>>>>>>> dda5e29f704555960415ffa95a9c9688f089b77f
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

