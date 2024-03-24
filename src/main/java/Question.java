import java.util.ArrayList;
import java.util.List;

public abstract class Question {
    private String title;
    private boolean isActive;
    private List<String> correct_answers;
    private String receiving_letter;

    public Question(String title) {
        this.title = title;
        this.correct_answers = new ArrayList<>();
    }

    public abstract String showQuestion();

    /**
     * Adds the correct answer to the question.
     * If the answer is either null or empty, then an exception will be thrown.
     *
     * @param answer The correct answer that needs to be added.
     */
    public void addCorrectAnswer(String answer) {
        if (answer == null || answer.isEmpty()) {
            throw new IllegalArgumentException("Correct answer cannot be null or empty");
        }

        this.correct_answers.add(answer);
    }

    /**
     * Checks if the answer is correct.
     * This is done case-insensitive.
     *
     * @param answer The given answer to the question by the player.
     * @return Data as a {@link Boolean}. Either true or false.
     */
    public boolean isCorrectAnswer(String answer) {
        return this.correct_answers.stream().anyMatch(answer::equalsIgnoreCase);
    }

    public String getTitle() {
        return this.title;
    }
    public String getReceivingLetter() {
        return this.receiving_letter;
    }

    public void setReceivingLetter(String letter) {
        this.receiving_letter = letter;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }


}
