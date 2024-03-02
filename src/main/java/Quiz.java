import java.util.ArrayList;

public class Quiz {
    private String title;
    private int purchase_amount;
    private int amount_correct_questions;
    private ArrayList<Question> questions;
    private int times_played;

    private int index_question;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.purchase_amount = 40;
        this.amount_correct_questions = 0;
        this.times_played = 0;
        this.index_question = 0;
    }

    public Quiz(String title) {
        this();
        this.title = title;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public int getTimesPlayed() {
        return this.times_played;
    }

    public String showNextQuestion() {
        return this.questions.get(index_question).showQuestion();
    }

    public boolean checkAnswer(String answer) {
        if (questions.get(index_question++).isCorrectAnswer(answer)) {
            amount_correct_questions++;
            return true;
        }
        return false;
    }

    public int getIndexQuestion() {
        return this.index_question;
    }

    public char getLetter() {
        if (index_question == 0) {
            return this.questions.get(index_question).getTitle().charAt(0);
        }

        return this.questions.get(index_question - 1).getTitle().charAt(0);
    }
}
