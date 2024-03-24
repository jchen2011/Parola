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

    /**
     * Method to add a question to the quiz.
     * If the question is null, then there will be an exception thrown.
     *
     * @param question The question that needs to be added to the quiz.
     */
    public void addQuestion(Question question) {
        if (question == null) {
            throw new IllegalArgumentException("Question cannot be null");
        }

        this.questions.add(question);
    }

    /**
     * Gets the current question in the list with an index.
     * There will be an exception thrown, if there are no questions more left in the quiz.
     * @return The question as a {@link String}.
     */
    public String showNextQuestion() {
        if (index_question > questions.size()) {
            throw new IllegalStateException("No more questions in the quiz");
        }

        return this.questions.get(index_question).showQuestion();
    }

    /**
     * Checks if the answer is correct. If it is correct, then the 'correct questions' and 'index' will be increased with 1. It also returns a true.
     * Otherwise, it just returns false if the answer is incorrect.
     *
     * @param answer The given answer by the player to the question.
     * @return Data as {@link Boolean}. Either true or false.
     */
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

    /**
     * Workaround to get the letter from the previous question. The index is increased at the method 'checkAnswer'.
     * This is done because the main class cannot be changed.
     * The first 'if check' is to ensure that the 'index' will not be less than 0.
     * @return The letter of the question as a {@link String}.
     */
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
