public class OpenQuestion extends Question {
    public OpenQuestion(String title) {
        super(title);
    }

    @Override
    public void showQuestion() {
        System.out.println(this.getTitle());
    }
}
