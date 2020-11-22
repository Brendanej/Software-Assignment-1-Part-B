

/**
 *
 * @author brend
 */
import org.joda.time.*;
public class Main {
    
    public static void main(String[] args) {
        //Making Students and their info
        Student Student1 = new Student("Brendan",15,"17/5/2005",1);
        Student Student2 = new Student("Sarah",17,"6/2/2003",2);
        Student Student3 = new Student("Peter",17,"8/09/2000",3);
        //making Module and their info
        Module EE356 = new Module("EE456", "1", new Student[]{Student1, Student2},"EE355 and EE354");
        Module EE355 = new Module("EE455", "2", new Student[]{Student1, Student3},"EE356 and EE354");
        Module EE354 = new Module("EE454", "3", new Student[]{Student1, Student3, Student2},"EE355 and EE356");
        //Making Course and their info
        Course ECE = new Course("ECE", new Module[]{EE356, EE355, EE354},new DateTime("2016-02-08"), new DateTime("2020-08-04"),new Student[]{Student1});
        //print outs
        System.out.println("Courses : "+ECE.getCourseName());
        System.out.println("Modules : "+ EE356.getModuleName()+ " " + EE355.getModuleName()+ " "+EE354.getModuleName());
        System.out.println("Students : "+ Student1.getName()+ " "+Student2.getName() +" "+Student3.getName());
        System.out.println("Name : "+ Student2.getName() + ". Modules : " + EE356.getModuleName() + "  " + EE355.getModuleName()
                + ", and " + EE354.getModuleName() + ". Course : " + ECE.getCourseName() +" StartDate :" + ECE.getStartDate() 
                +" StartDate :"+ECE.getEndDate()+".");
        System.out.println("Name : "+Student1.getName() + ". Modules : " + EE355.getModuleName()
                + " and " + EE354.getModuleName() + ". Course : " + ECE.getCourseName()+" StartDate :" + ECE.getStartDate() 
                +" StartDate :"+ECE.getEndDate()+".");
        System.out.println("Name : " +Student3.getName() + ". Modules : " + EE356.getModuleName()
                + " and " + EE354.getModuleName() + ". Course : " + ECE.getCourseName() +" StartDate :" + ECE.getStartDate() 
                +" StartDate :"+ECE.getEndDate()+".");
    }
    

}
