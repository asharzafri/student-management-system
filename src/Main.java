import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Calling student manager
        StudentManager studentManager=new StudentManager();
        //Calling professor manager
        ProfessorManager professorManager=new ProfessorManager();
        // Calling Grade manager
        GradeManager gradeManager=new GradeManager();



      while(true) {
          // Welcome message
          System.out.println("=== Student Management System ===");
          System.out.println("Please select one of the following:");
          System.out.println("1. Add Student");
          System.out.println("2. View Student");
          System.out.println("3. Add Professors");
          System.out.println("4. View Professors");
          System.out.println("5. Add Grade");
          System.out.println("6. View Grade");
          System.out.println("7. Approve Grade");
          System.out.println("8. Exit");
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
           else if(choice==5) {
               //calling method from Grade manager
               gradeManager.addGrade(scanner, studentManager.students);
           }
           else if(choice==6) {
               //calling method from Grade manager
               gradeManager.viewGrades(scanner, studentManager.students);
           }

           else if(choice==7) {
               //calling method from Grade manager
               gradeManager.approveGrade(scanner, studentManager.students);
           }

           // Eixt
          else if(choice==8) {
              studentManager.exit();
              break;

          }


      }

    }
}


