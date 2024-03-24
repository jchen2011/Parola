import java.util.ArrayList;
import java.util.List;

public class QuizHandler {
    private List<Quiz> quizzes;

    public QuizHandler() {
        this.quizzes = new ArrayList<>();
        MockData m = new MockData();
        this.quizzes = m.getAllQuizzes();
    }

    public void addQuiz(Quiz q) {
        if (q == null) {
            throw new IllegalArgumentException("Quiz cannot be null");
        }

        this.quizzes.add(q);
    }

    //TODO: Algoritme verzinnen om een zoveel mogelijk een quiz te krijgen die je nog niet eerder hebt gespeeld
    public Quiz getQuiz() {
        if (quizzes.isEmpty()) {
            throw new IllegalStateException("No quizzes available");
        }

        return this.quizzes.get(0);
    }
}
