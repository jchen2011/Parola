import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{
    private ArrayList<String> choices;

    public MultipleChoiceQuestion(String title) {
        super(title);
        this.choices = new ArrayList<>();
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

        for (String choice : choices) {
            s.append(choice + "\n");
        }

        return s.toString();
    }

    /**
     * For a multiple-choice question is it possible to add a choice/alternative to the question.
     *
     * @param choice A possible choice/alternative to the multiple-choice question.
     */
    public void addChoice(String choice) {
        this.choices.add(choice);
    }
}
