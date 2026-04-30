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


                System.out.println("Name: " + s.getFullName() + " Grade: " + s.grades );

            }

        }

    }
}
