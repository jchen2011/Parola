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
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void addCorrectAnswer(String answer) {
        if (answer == null || answer.isEmpty()) {
            throw new IllegalArgumentException("Correct answer cannot be null or empty");
        }

        this.correct_answers.add(answer);
    }

    public boolean isCorrectAnswer(String answer) {
        return this.correct_answers.stream().anyMatch(answer::equalsIgnoreCase);
    }

    public String getTitle() {
        return this.title;
    }

    public void setReceivingLetter(String letter) {
        this.receiving_letter = letter;
    }

    public String getReceivingLetter() {
        return this.receiving_letter;
    }

}
