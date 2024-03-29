import java.util.ArrayList;
import java.util.List;

public class QuizHandler {
    private List<Quiz> quizzes;
    private Timer timer;

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
     * Method to get a specific quiz. This is hardcoded because it was not required to make an algorithm for this,
     * It will throw an exception if there are no quizzes.
     * @return A quiz in the list as a {@link Quiz}.
     */
    public Quiz getQuiz() {
        if (quizzes.isEmpty()) {
            throw new IllegalStateException("No quizzes available");
        }
        this.timer = new Timer();
        startTimer();

        return this.quizzes.get(0);
    }

    public void startTimer() {
        this.timer.startTimer();
    }

    public void stopTimer() {
        this.timer.stopTimer();
    }

    public long getStartTime() {
        return this.timer.getStartTimer();
    }

    public long getStopTime() {
        return this.timer.getStopTimer();
    }
}
