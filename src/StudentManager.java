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
   public void viewProfile(Scanner scanner){
       System.out.println("Enter Student ID");
       int id=scanner.nextInt();
       scanner.nextLine(); // add this line to clear the buffer
       for(Student s:students) {
            if(s.studentId==id){
                System.out.println("=== Student Profile === ");
                System.out.println("Name: " + s.getFullName());
                System.out.println("ID: "+ s.studentId);
                System.out.println("GPA: " + s.gpa);
                System.out.println("Standing: " + s.getStanding());
                System.out.println("Enrolled: " + s.isEnrolled);
                System.out.println("");// empty line
                System.out.println("Grades:");
                if (s.grades.size() == 0) {
                    System.out.println("No grades on record");
                } else {
                    for (Grade g : s.grades) {
                        System.out.println(g.courseCode + " - " + g.score + " - " + g.getLetterGrade() + " - Approved: " + g.isApproved);
                    }
                }

            }

       }
   }
   public void exit(){
       System.out.println("Thank you Good Bye!");
   }

}
