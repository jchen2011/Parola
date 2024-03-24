import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String title;
    private int purchase_amount;
    private int amount_correct_questions;
    private List<Question> questions;
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
        if (question == null) {
            throw new IllegalArgumentException("Question cannot be null");
        }

        this.questions.add(question);
    }

    public String showNextQuestion() {
        if (index_question > questions.size()) {
            throw new IllegalStateException("No more questions in the quiz");
        }

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

    public String getLetter() {
        if (index_question == 0) {
            return this.questions.get(index_question).getReceivingLetter();
        }

        return this.questions.get(index_question - 1).getReceivingLetter();
    }

    public int getAmountCorrectQuestions() {
        return amount_correct_questions;
    }

    public int getTimesPlayed() {
        return this.times_played;
    }

    public int getQuizSize() {
        return this.questions.size();
    }
    public int getPurchaseAmount() {
        return purchase_amount;
    }
}
