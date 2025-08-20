public class e3 {

    public static void main(String[] args) {
        int score = 75;
        char grade = 'B';
        boolean passed = true;

        if (score < 60) {
            grade = 'D';
            passed = false;
        } else if (score >= 60 && score <= 74) {
            grade = 'C';
        } else if (score >= 75 && score <= 89) {
            grade = 'B';
        } else if (score >= 90) {
            grade = 'A';
        }
        // TODO: Check pass or fail
        System.out.println(passed ? "Passed" : "Failed");

        // TODO: Determine grade based on score
        System.out.println("Grade: " + grade);
    }
}