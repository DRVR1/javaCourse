package quiz;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.addQuestion("What does apfel means in german?", "apple", "apply", "appear", "pie",
                "apple");
        questionService.addQuestion("What does privet means in russian?", "hello", "goodbye", "thank you", "idk",
                "privet");
        questionService.displayQuestions();
        questionService.displayScore();
    }
}
