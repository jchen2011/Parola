import java.util.ArrayList;

public abstract class Question {
    private String title;
    private boolean isActive;
    private ArrayList<String> correct_answers;

    public Question(String title) {
        this.title = title;
        this.correct_answers = new ArrayList<>();
    }

    public abstract void showQuestion();
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void addCorrectAnswer(String answer) {
        this.correct_answers.add(answer);
    }

    public String getTitle() {
        return this.title;
    }

}
