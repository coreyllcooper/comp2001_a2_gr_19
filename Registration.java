
/**
 * Write a description of class Enrollment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Registration
{
    // instance variables - replace the example below with your own
    private String courseNumber;
    private int section;
    private int timeSlot;
    private String student;
    private String professor;

    /**
     * Constructor for objects of class Registration
     */
    public Registration(String courseNumber, int section, int slot, 
                      String student,String professor)
    {
        // initialise instance variables
        
    }
    
    private boolean verifyCourseNumber(String courseNumber)
    {
        return true;
    }
    
    private boolean verifySection(int section)
    {
        return true;
    }
    
    private boolean verifySlot (int slot)
    {
        return true;
    }

   public void printInfo()
   {
       // print all the information about the enrollment record
       // each field on a new line
   }
    
}
