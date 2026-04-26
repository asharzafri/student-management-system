import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
      ArrayList<Student> students = new ArrayList<>();
      ArrayList<Professor> professors = new ArrayList<>();


      //Adding student data to student Array
      students.add(new Student("Ashar", "Zafri", 1001, 3.75));
      students.add(new Student("Sara", "Khan", 1002, 3.2));
      students.add(new Student("John", "Doe", 1003, 2.1));

      // Adding data to Professor Array
      professors.add(new Professor("Mike", "Murry",8001,"Math"));
      professors.add(new Professor("John", "Doe",8002, "English"));
      professors.add(new Professor("Peter", "Pan",8003, "History"));

      System.out.println("Student List");
      //Total number of students
      System.out.println("Total Number of Students: " + students.size());
      //Printing everything data from student Array
      for(Student s : students){
            System.out.println(s.getFullName() + " - GPA: " + s.gpa);
      }

      //Break line
      System.out.println("-------");


      System.out.println("Professor List");
      //Total number of professors
      System.out.println("Total Number of Professors: " + professors.size());

      //Printing all data from professor Array
        for(Professor p : professors){
            System.out.println("Full Name: "+ p.getFullName()+ " - Department: "+ p.department);
        }


    }
}


