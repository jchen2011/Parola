package question;

import java.util.ArrayList;
import java.util.List;

public class OpenQuestion extends Question {
    private List<String> correct_answers;

    public OpenQuestion(String title) {
        super(title);
        this.correct_answers = new ArrayList<>();
    }

    /**
     * Shows the title of the question.
     *
     * @return Title of the question as a {@link String}.
     */
    @Override
    public String showQuestion() {
        return this.getTitle();
    }

    /**
     * Checks if the answer is correct.
     * This is done case-insensitive.
     *
     * @param answer The given answer to the question by the player.
     * @return Data as a {@link Boolean}. Either true or false.
     */
    @Override
    public boolean isCorrectAnswer(String answer) {
        return this.correct_answers.stream().anyMatch(answer::equalsIgnoreCase);
    }

    /**
     * Adds the correct answer to the question.
     * If the answer is either null or empty, then an exception will be thrown.
     *
     * @param answer The correct answer that needs to be added.
     */
    @Override
    public void addCorrectAnswer(String answer) {
        if (answer == null || answer.isEmpty()) {
            throw new IllegalArgumentException("Correct answer cannot be null or empty");
        }

        this.correct_answers.add(answer);
    }
}
