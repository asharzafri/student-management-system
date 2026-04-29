import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students=new ArrayList<>();
    StudentManager(){

   }
   public void addStudent(Scanner scanner){
       //asking user to enter Data
       System.out.println("Enter Student ID");
       int id=scanner.nextInt();
       scanner.nextLine(); // add this line to clear the buffer
       System.out.println("Enter Student first name");
       String firstname=scanner.nextLine();
       System.out.println("Enter Student Surname");
       String lastname=scanner.nextLine();
       System.out.print("Enter GPA: ");
       double gpa = scanner.nextDouble();
       //creating a student object from data shared by user
       Student student = new Student(firstname,lastname,id,gpa);
       //Adding data to Array list
       students.add(student);
   }
   public void viewStudents(){
       System.out.println("Total number of students in system: "+students.size());
       for(Student s:students) {
           System.out.println(s.getFullName() + " - GPA: " + s.gpa + " - " + s.getStanding());
       }
   }
   public void exit(){
       System.out.println("Thank you Good Bye!");
   }

}
