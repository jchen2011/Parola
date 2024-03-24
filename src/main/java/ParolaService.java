import exception.UsernameDoesNotExistException;
import scoring.IScoring;
import scoring.SimpleScoring;

/**
 * The business logic for all the methods in the ParolaController class.
 */
public class ParolaService {
    private Quiz currentQuiz;
    private Player currentPlayer;
    private Timer timer;

    /**
     * Starts the quiz by initializing the player, quiz and timer.
     * The player is initialized because of the registration. After gathering the quiz, the players gets 40 credits in deduction for playing the quiz.
     * The quiz initialized so that there is a quiz possible to play.
     * After that the timer is initialized for checking the amount of time it took to finish the quiz.
     *
     * @param username The given username in the registration.
     */
    public void startQuiz(String username) {
        currentPlayer = new Player(username);

        QuizHandler qh = new QuizHandler();
        currentQuiz = qh.getQuiz();

        currentPlayer.deductCredits(currentQuiz.getPurchaseAmount());

        timer = new Timer();
        timer.startTimer();
    }

    /**
     * Checks first if the player username is present. Otherwise, there will be an exception with "Invalid username.".
     * After that it shows the next question in the current quiz.
     * @param username The given username in the registration.
     * @return The next question as a {@link String}.
     */
    public String getNextQuestion(String username) {
        if (currentPlayer.isUsernamePresent(username)) {
            return this.currentQuiz.showNextQuestion();
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }

    /**
     * Checks first if the player username is present. Otherwise, there will be an exception with "Invalid username.".
     * Then it checks if the answer is either right or wrong. If it is right, then the player will receive a new letter.
     *
     * @param username The given username in the registration.
     * @param answer The given answer by the player to the question.
     */
    public void processAnswer(String username, String answer) {
        if (currentPlayer.isUsernamePresent(username)) {
            if (currentQuiz.checkAnswer(answer)) {
                currentPlayer.addLetter(currentQuiz.getLetter());
            }
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }

    /**
     * Checks first if the player username is present. Otherwise, there will be an exception with "Invalid username.".
     * After that it checks if the index of the question is greater or equal to the size of Quiz. If it is greater, then the timer will stop and it return true.
     * Otherwise, it returns false.
     *
     * @param username The given username in the registration.
     * @return Data in {@link Boolean} to see if the quiz is finished or not.
     */
    public boolean checkQuizFinished(String username) {
        if (currentPlayer.isUsernamePresent(username)) {
            if (currentQuiz.getIndexQuestion() >= currentQuiz.getQuizSize()) {
                timer.stopTimer();
                return true;
            }
            return false;
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }

    /**
     * Checks first if the player username is present. Otherwise, there will be an exception with "Invalid username.".
     * Then the player will receive their given letters, according to the given correct answers.
     *
     * @param username The given username in the registration.
     * @return The letters divided with ',' as a {@link String}.
     */
    public String getLettersForRightAnswers(String username) {
        if (currentPlayer.isUsernamePresent(username)) {
            return currentPlayer.showLetters();
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }

    /**
     * Checks first if the player username is present. Otherwise, there will be an exception with "Invalid username.".
     * Then it initiates the {@link WordReader} and {@link IScoring}.
     * {@link WordReader} is used for checking if the word is in the dictionary.
     * {@link IScoring} is used for calculating the score with the three parameters: length_word, amount_correct_questions and the time.
     *
     * @param username The given username in the registration.
     * @param word The given word by the player.
     * @return The calculated score as an {@link Integer}.
     */
    public int calculateScore(String username, String word) {
        if (currentPlayer.isUsernamePresent(username)) {
            WordReader w = new WordReader();

            IScoring score = new SimpleScoring();

            int length_word = w.getScore(word, currentPlayer.getLetters());
            int amount_correct_questions = currentQuiz.getAmountCorrectQuestions();
            long time = ((timer.getStopTimer() - timer.getStartTimer()) / 1000);

            return score.calculateScore(amount_correct_questions, length_word, time);
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }
}
