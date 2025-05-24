package quiz;

import quiz.QuestionService;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.addQuestion("1", "What does apfel means in german?", "apple", "apply", "appear", "pie",
                "apple");
        questionService.addQuestion("2", "What does privet means in russian?", "hello", "goodbye", "thank you", "idk",
                "privet");
        questionService.displayQuestions();
        questionService.displayScore();
    }
}
