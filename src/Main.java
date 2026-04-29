import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentManager studentManager=new StudentManager();


      while(true) {
          // Welcome message
          System.out.println("=== Student Management System ===");
          System.out.println("Please select one of the following:");
          System.out.println("1. Add Student");
          System.out.println("2. View Student");
          System.out.println("3. Exit");
          int choice=scanner.nextInt();


           if(choice==1) {
               //Calling methods from StudentManger
               studentManager.addStudent(scanner);
           }
           else if(choice==2) {
               //Calling methods from StudentManger
               studentManager.viewStudents();
           }
           // Eixt
          else if(choice==3) {
              studentManager.exit();
              break;

          }


      }

    }
}


