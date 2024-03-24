public class ParolaController {
    private static ParolaController instance;
    private ParolaService parolaService;

    public ParolaController() {
        this.parolaService = new ParolaService();
    }

    /**
     * Singleton to make the ParolaController instance.
     * Ensures that the class has only one instance.
     *
     * @return A single {@link ParolaController} instance.
     */
    public static ParolaController getInstance() {
        if (instance == null) {
            instance = new ParolaController();
        }
        return instance;
    }

    /**
     * Method in the controller to start the quiz.
     *
     * @param username The given username in the registration.
     */
    public void startQuiz(String username) {
        this.parolaService.startQuiz(username);
    }

    /**
     * Method in the controller to get the next question in the quiz.
     *
     * @param username The given username in the registration.
     * @return The next question in the playing quiz as a {@link String}.
     */
    public String nextQuestion(String username) {
        return this.parolaService.getNextQuestion(username);
    }

    /**
     * Method in the controller to check if the answer is right or not.
     *
     * @param username The given username in the registration.
     * @param answer The given answer from the player to the question.
     */
    public void processAnswer(String username, String answer) {
        this.parolaService.processAnswer(username, answer);
    }

    /**
     * Method in the controller to check if the quiz is finished.
     *
     * @param username The given username in the registration.
     * @return Data in {@link Boolean} to see if the quiz is finished or not.
     */
    public boolean quizFinished(String username) {
        return this.parolaService.checkQuizFinished(username);
    }

    /**
     * Method in the controller to get the letters from the player for all right answers.
     *
     * @param username The given username in the registration.
     * @return All letters that the player has received as a {@link String}.
     */
    public String getLettersForRightAnswers(String username) {
        return this.parolaService.getLettersForRightAnswers(username);
    }

    /**
     * Method in the controller to calculate the score according to the given word by the player.
     *
     * @param username The given username in the registration.
     * @param word The given word by the player.
     * @return The score as an {@link Integer}.
     */
    public int calculateScore(String username, String word) {
        return this.parolaService.calculateScore(username, word);
    }
}
