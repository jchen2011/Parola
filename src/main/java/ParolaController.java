public class ParolaController {
    private static ParolaController instance;
    private Quiz currentQuiz;
    private Player currentPlayer;
    public static ParolaController getInstance() {
        if (instance == null) {
            instance = new ParolaController();
        }
        return instance;
    }

    public void startQuiz(String username) {
        currentPlayer = new Player(username);
        currentPlayer.deductCredits(40);

        QuizHandler qh = new QuizHandler();
        currentQuiz = qh.getQuiz();
    }

    public String nextQuestion(String username) {
        return this.currentQuiz.showNextQuestion();
    }

    public void processAnswer(String username, String answer) {
        if (currentQuiz.checkAnswer(answer)) {
            currentPlayer.addLetter(String.valueOf(currentQuiz.getLetter()));
        }
    }

    public boolean quizFinished(String username) {
        return currentQuiz.getIndexQuestion() >= 8;
    }

    public String getLettersForRightAnswers(String username) {
        return currentPlayer.showLetters();
    }

    public int calculateScore(String username, String word) {
        return 0;
    }
}
