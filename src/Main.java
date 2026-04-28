import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Ashar's  Student Management System");

        // Asking user to enter the data.
        System.out.print("Enter student first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        // Creating a Student object from the input
        Student student = new Student(firstName, lastName, id, gpa);



        //Printing entered Data
        System.out.println("--- Student Created ---");
        System.out.println("Name: "+ student.getFullName());
        System.out.println("ID: "+student.studentId);
        System.out.println("GPA: "+student.gpa);
        System.out.println("Standing: "+student.getStanding());


    }
}


