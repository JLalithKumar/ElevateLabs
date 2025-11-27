import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> quiz = new ArrayList<>();
        quiz.add(new Question("Which of these is a valid Java identifier?", 
                List.of("2variable", "_myVar", "class", "void"), 2));
        quiz.add(new Question("Which keyword is used to inherit a class in Java?", 
                List.of("this", "super", "extends", "implements"), 3));
        quiz.add(new Question("Which of these is NOT a Java access modifier?", 
                List.of("public", "protected", "private", "package"), 4));
        quiz.add(new Question("Which method is the entry point of a Java program?", 
                List.of("start()", "main()", "run()", "init()"), 2));
        quiz.add(new Question("Which of these is used to create a new object in Java?", 
                List.of("new", "create", "instantiate", "make"), 1));

        int score = 0;

        for (Question q : quiz) {
            q.displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();
            if (q.checkAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + quiz.size());
    }
}