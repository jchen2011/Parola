import exception.UsernameDoesNotExistException;
import scoring.IScoring;
import scoring.SimpleScoring;

public class ParolaService {
    private Quiz currentQuiz;
    private Player currentPlayer;
    private Timer timer;

    public void startQuiz(String username) {
        currentPlayer = new Player(username);

        QuizHandler qh = new QuizHandler();
        currentQuiz = qh.getQuiz();

        currentPlayer.deductCredits(currentQuiz.getPurchaseAmount());

        timer = new Timer();
        timer.startTimer();
    }

    public String getNextQuestion(String username) {
        if (currentPlayer.isUsernamePresent(username)) {
            return this.currentQuiz.showNextQuestion();
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }

    public void processAnswer(String username, String answer) {
        if (currentPlayer.isUsernamePresent(username)) {
            if (currentQuiz.checkAnswer(answer)) {
                currentPlayer.addLetter(currentQuiz.getLetter());
            }
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }

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

    public String getLettersForRightAnswers(String username) {
        if (currentPlayer.isUsernamePresent(username)) {
            return currentPlayer.showLetters();
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }

    public int calculateScore(String username, String word) {
        if (currentPlayer.isUsernamePresent(username)) {
            WordReader w = new WordReader();

            IScoring score = new SimpleScoring();

            int length_word = w.getScore(word, currentPlayer.getLetters());
            int amount_correct_questions = currentQuiz.getAmountCorrectQuestions();
            long time = ((timer.getStopTimer() - timer.getStartTimer()) / 1000);

            System.out.println("LENGTH: " + length_word);
            System.out.println("correct questions: " + amount_correct_questions);
            System.out.println("time: " + time);

            return score.calculateScore(amount_correct_questions, length_word, time);
        } else {
            throw new UsernameDoesNotExistException("Invalid username.");
        }
    }
}
