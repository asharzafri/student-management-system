public class Professor {
    String firstName;
    String lastName;
    int professorId;
    String department;

    //Constructor
    public Professor(String firstName, String lastName, int professorId, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.professorId = professorId;
        this.department = department;
    }

    //Getting the Full Name
    public String getFullName() {
        return firstName + " " + lastName;
    }



}
