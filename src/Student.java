import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    int studentId;
    double gpa;
    boolean isEnrolled;

    //Creating a Array for storing grades
    ArrayList<Grade> grades = new ArrayList<>();

    //Constructor
    public Student(String firstName, String lastName, int studentId, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getStanding(){
        if(gpa>= 3.5){
            return "First Class Honours";
        }
        else if (gpa>=2.5) {
            return "Second Class Honours";
        }
        else{
            return "Refer to Academic Office";
        }


    }


}

