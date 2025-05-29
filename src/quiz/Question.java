package quiz;

import java.util.ArrayList;

public class Question {
    private String questionn;
    private ArrayList<String> options;
    private String answer;

    public Question(String questionn, String op1, String op2, String op3, String op4, String answer) {
        options = new ArrayList<>();
        this.options.add(op1);
        this.options.add(op2);
        this.options.add(op3);
        this.options.add(op4);
        this.questionn = questionn;
        this.answer = answer;
    }

    public String getQuestionn() {
        return questionn;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestionn(String questionn) {
        this.questionn = questionn;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

}
