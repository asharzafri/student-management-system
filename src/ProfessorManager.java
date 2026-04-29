import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorManager {
    ArrayList<Professor> professors=new ArrayList<>();
    ProfessorManager(){

    }
    public void addProfessor(Scanner scanner){
        //asking user to enter Data
        System.out.println("Enter Staff ID");
        int id=scanner.nextInt();
        scanner.nextLine(); // add this line to clear the buffer
        System.out.println("Enter professor's first name");
        String firstname=scanner.nextLine();
        System.out.println("Enter professor's Surname");
        String lastname=scanner.nextLine();
        System.out.print("Enter professor's department name: ");
        String department=scanner.nextLine();
        //creating a student object from data shared by user
        Professor professor = new Professor(firstname,lastname,id,department);
        //Adding data to Array list
        professors.add(professor);
    }
    public void viewProfessors(){
        System.out.println("Total number of professors in system: "+ professors.size());
        for(Professor p:professors) {
            System.out.println(p.getFullName() + " - Department: " + p.department);
        }
    }
    public void exit(){
        System.out.println("Thank you Good Bye!");
    }
}
