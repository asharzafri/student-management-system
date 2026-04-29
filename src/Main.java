import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<Student>();


      while(true) {
          // Welcome message
          System.out.println("=== Student Management System ===");
          System.out.println("Please select one of the following:");
          System.out.println("1. Add Student");
          System.out.println("2. View Student");
          System.out.println("3. Exit");
          int choice=scanner.nextInt();
           if(choice==1) {
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
           else if(choice==2) {
               //Using size() method to find the total of array Student
               System.out.println("Total number of students in system: "+students.size());

               for(Student s:students) {
                   System.out.println(s.getFullName() + " - GPA: " + s.gpa + " - " + s.getStanding());
               }
           }
           // Eixt
          else if(choice==3) {
              System.out.println("Thank you Good Bye!");
              break;

          }


      }

    }
}


