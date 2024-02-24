import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{

    private ArrayList<String> choices;
    public MultipleChoiceQuestion(String title) {
        super(title);
    }
    @Override
    public void showQuestion() {
        System.out.println(this.getTitle());
        for (String choice : choices) {
            System.out.println(choice);
        }
    }

    public void addChoice(String choice) {
        this.choices.add(choice);
    }
}
