import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Calling student manager
        StudentManager studentManager=new StudentManager();
        //Calling professor manager
        ProfessorManager professorManager=new ProfessorManager();



      while(true) {
          // Welcome message
          System.out.println("=== Student Management System ===");
          System.out.println("Please select one of the following:");
          System.out.println("1. Add Student");
          System.out.println("2. View Student");
          System.out.println("3. Add Professors");
          System.out.println("4. View Professors");
          System.out.println("5. Exit");
          int choice=scanner.nextInt();


           if(choice==1) {
               //Calling methods from StudentManger
               studentManager.addStudent(scanner);
           }
           else if(choice==2) {
               //Calling methods from StudentManger
               studentManager.viewStudents();
           }
           else if(choice==3) {
               //Calling methods from professor manager
               professorManager.addProfessor(scanner);
           }
           else if(choice==4) {
               //Calling methods from professor manager
               professorManager.viewProfessors();
           }

           // Eixt
          else if(choice==5) {
              studentManager.exit();
              break;

          }


      }

    }
}


