import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{

    private String correct_answer;
    private ArrayList<String> other_answers;

    public MultipleChoiceQuestion(String title) {
        super(title);
        this.other_answers = new ArrayList<>();
    }

    /**
     * Method to show the question like a multiple choice question.
     * It uses string builder to show the title first and then every possible alternative.
     *
     * @return The question title and alternative as a {@link String}.
     */
    @Override
    public String showQuestion() {
        StringBuilder s = new StringBuilder();

        s.append(this.getTitle() + "\n");

        for (String choice : other_answers) {
            s.append(choice + "\n");
        }

        return s.toString();
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
        return correct_answer.equalsIgnoreCase(answer);
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

        this.correct_answer = answer;
    }

    /**
     * For a multiple-choice question is it possible to add a choice/alternative to the question.
     *
     * @param choice A possible choice/alternative to the multiple-choice question.
     */
    public void addChoice(String choice) {
        this.other_answers.add(choice);
    }
}
