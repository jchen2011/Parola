import java.util.ArrayList;
import java.util.List;

public class QuizHandler {
    private List<Quiz> quizzes;

    public QuizHandler() {
        this.quizzes = new ArrayList<>();
        MockData m = new MockData();
        this.quizzes = m.getAllQuizzes();
    }

    /**
     * Method to add a quiz to the list. This list will be used to get a quiz for playing the game.
     * If the quiz is null, then an exception will be thrown.
     *
     * @param q The quiz that needs to be added to the list.
     */
    public void addQuiz(Quiz q) {
        if (q == null) {
            throw new IllegalArgumentException("Quiz cannot be null");
        }

        this.quizzes.add(q);
    }

    /**
     *
     * @return A quiz in the list as a {@link Quiz}.
     */
    //TODO: Algoritme verzinnen om een zoveel mogelijk een quiz te krijgen die je nog niet eerder hebt gespeeld
    public Quiz getQuiz() {
        if (quizzes.isEmpty()) {
            throw new IllegalStateException("No quizzes available");
        }

        return this.quizzes.get(0);
    }
}
