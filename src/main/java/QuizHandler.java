import java.util.ArrayList;

public class QuizHandler {
    private ArrayList<Quiz> quizzes;

    public QuizHandler() {
        this.quizzes = new ArrayList<>();
        MockData m = new MockData();
        this.quizzes = m.getAllQuizzes();
    }

    public void addQuiz(Quiz q) {
        this.quizzes.add(q);
    }

    //TODO: Algoritme verzinnen om een zoveel mogelijk een quiz te krijgen die je nog niet eerder hebt gespeeld
    public Quiz getQuiz() {
        return this.quizzes.get(0);
    }
}
