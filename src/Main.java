import java.util.Scanner;

public class Main {
    public static boolean isPassingGrade(double score) {
        if (score>= 40){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println("Result:" + isPassingGrade(25));
        System.out.println("Result:" + isPassingGrade(40));
        System.out.println("Result:" + isPassingGrade(75));

    }
}


