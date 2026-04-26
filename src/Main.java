import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String role = "STUDENT";
        String name = "Ashar";

        if (role.equals( "SUPER_ADMIN")){
            System.out.println("Full system access");

        }else if (role.equals("PROFESSOR")){
            System.out.println("Grade and student access");
        } else if (role.equals("STUDENT")) {
            System.out.println("Own profile access only");

        }else {
            System.out.println("Unknown role");

        }
    }
}


