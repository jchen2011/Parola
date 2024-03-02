public class OpenQuestion extends Question {
    public OpenQuestion(String title) {
        super(title);
    }

    @Override
    public String showQuestion() {
        return this.getTitle();
    }
}
