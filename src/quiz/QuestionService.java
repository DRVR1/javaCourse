package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {

    private ArrayList<Question> questionList = new ArrayList<>();
    private int score = 0;

    public void addQuestion(String questionn, String op1, String op2, String op3, String op4,
            String answer) {
        Question q = new Question(questionn, op1, op2, op3, op4, answer);
        questionList.add(q);
    }

    public void displayQuestions() {
        System.out.println("Displaying questions: ");
        for (Question q : questionList) {
            System.out.println(q.getQuestionn());
            for (String op : q.getOptions()) {
                System.out.println(op);
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the answer: ");
            String selection = sc.nextLine();
            if (selection.equals(q.getAnswer())) {
                score++;
                System.out.println("Correct !");
            } else {
                System.out.println("Not correct !");
            }
            System.out.println("Your current score is: " + this.score);
            System.out.print("Continue");
            sc.nextLine();
            System.out.println("");
        }
    }

    public void displayScore() {
        System.out.println("Your final score is: " + this.score);
    }
}
