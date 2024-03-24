import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{
    private ArrayList<String> choices;

    public MultipleChoiceQuestion(String title) {
        super(title);
        this.choices = new ArrayList<>();
    }
    @Override
    public String showQuestion() {
        StringBuilder s = new StringBuilder();

        s.append(this.getTitle() + "\n");

        for (String choice : choices) {
            s.append(choice + "\n");
        }

        return s.toString();
    }

    public void addChoice(String choice) {
        this.choices.add(choice);
    }
}
