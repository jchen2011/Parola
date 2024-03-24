public class ParolaController {
    private static ParolaController instance;

    private ParolaService parolaService;

    public ParolaController() {
        this.parolaService = new ParolaService();
    }
    public static ParolaController getInstance() {
        if (instance == null) {
            instance = new ParolaController();
        }
        return instance;
    }

    public void startQuiz(String username) {
        this.parolaService.startQuiz(username);
    }

    public String nextQuestion(String username) {
        return this.parolaService.getNextQuestion(username);
    }

    public void processAnswer(String username, String answer) {
        this.parolaService.processAnswer(username, answer);
    }

    public boolean quizFinished(String username) {
        return this.parolaService.checkQuizFinished(username);
    }

    public String getLettersForRightAnswers(String username) {
        return this.parolaService.getLettersForRightAnswers(username);
    }

    public int calculateScore(String username, String word) {
        return this.parolaService.calculateScore(username, word);
    }
}
