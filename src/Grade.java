public class Grade {
    String courseCode;
    double score;
    boolean isApproved;

    public Grade(String courseCode, double score) {
        this.courseCode = courseCode;
        this.score = score;
        this.isApproved = false;
    }

    public String getLetterGrade() {
        if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
