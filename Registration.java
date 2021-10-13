
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
        if (this.verifyCourseNumber(courseNumber)){
            this.courseNumber = courseNumber;
        } else{
            System.out.print("Invalid Course Number");
            courseNumber = "INVALID";
        }
        
        if (this.verifySection(section)){
            this.section = section;
        } else{
            System.out.print("Invalid Section");
            this.section = 3;
        }
        
        if (this.verifySlot(slot)){
            this.timeSlot = slot;
        } else{
            System.out.print("Invalid Time Slot");
            this.timeSlot = 0;
        }
        
        this.student = student;
        
        this.professor = professor;
            
        
        
       
        
    }
    
    private boolean verifyCourseNumber(String courseNumber)
    {
        String[] courses = {"COMP 1501", "ENGL 2201", "CHEM 3060", "PHYS 2344", "ENGL 2005", "COMP 2704", "PHYS 2377", "CHEM 4927", "COMP 3444"};
        boolean isVerified = false;
        for(String course : courses){
         if (courseNumber.equals(course)){
                isVerified = true;
            }   
        }
        return isVerified;
    }
    
    private boolean verifySection(int section)
    {   boolean isVerified = false;
        if (section >= 0 && section <=2) {
        isVerified = true;
    }
    return isVerified;
    }
    
    private boolean verifySlot (int slot)
    {   boolean isVerified = false;
        if (slot >=12 && slot <=25){
        isVerified = true;
    }
    return isVerified;
    }

   public void printInfo()
   {
        System.out.println("Course number: " + courseNumber);
        System.out.println("Section: " + section);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Student: " + student);
        System.out.println("Professor: " + professor);
   }
    
   public String getStudent(){
       return this.student;
   }
   public String getProfessor(){
       return this.professor;
   }
   public String getCourseNumber(){
       return this.courseNumber;
   }
    
}
