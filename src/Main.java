import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Student s1 = new Student("Ashar", "Zafri",1001,3.75);
      Student s2 = new Student("Sara", "Khan",1002,3.2);
      Professor p1 = new Professor("John", "Doe",8001,"English");
      Professor p2 = new Professor("Mike", "Jack",8002,"Maths");

        System.out.println(s1.getFullName()+" - "+s1.getStanding());
        System.out.println(s2.getFullName()+" - "+s2.getStanding());
        System.out.println("Professor: " + p1.getFullName());
        System.out.println("Professor: " + p2.getFullName());


    }
}


