public class Main {
    public static void main(String[] args) {
        Grade g1 = new Grade("MATH01", 75.0);
        System.out.println(g1.courseCode);
        System.out.println(g1.score);
        System.out.println(g1.isApproved);
        System.out.println(g1.getLetterGrade());
    }
}0