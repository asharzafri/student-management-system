import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {


    public void addGrade(Scanner scanner, ArrayList<Student> students){
        System.out.println("Enter student ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        for(Student s : students){
            if(s.studentId==id){
                System.out.println("Enter the Course code");
                String courseCode = scanner.nextLine();
                System.out.println("Enter the score1");
                double score = scanner.nextDouble();
                s.grades.add(new Grade(courseCode,score));


                System.out.println("Grade added successfully for: " + s.getFullName());

            }

        }

    }

    public void viewGrades(Scanner scanner, ArrayList<Student> students){
        System.out.println("Please enter student ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        for(Student s : students){
            if(s.studentId==id){
                if(s.grades.size() == 0){
                    System.out.println("No Grades Found");
                }
                else{
                    for(Grade g : s.grades){
                        System.out.println(g.courseCode + " - Score: " + g.score + " - " + g.getLetterGrade() + " - Approved: " + g.isApproved);
                    }
                }
            }
        }
    }

    public void approveGrade(Scanner scanner, ArrayList<Student> students){
        System.out.println("Please enter student ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        for(Student s : students){
            if(s.studentId==id){
                if(s.grades.size() == 0){
                    System.out.println("No Grades Found");
                }
                else{
                    for (int i = 0; i < s.grades.size(); i++) {
                        System.out.println((i + 1) + ". " + s.grades.get(i).courseCode);
                    }
                    System.out.println("Which Grade number would you like to approve?");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    Grade selected = s.grades.get(choice - 1);
                    selected.isApproved = true;
                    System.out.println("Grade approved successfully");

                }
            }
        }
    }
}
