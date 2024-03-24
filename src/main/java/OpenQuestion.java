public class OpenQuestion extends Question {
    public OpenQuestion(String title) {
        super(title);
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
}
