package scoring;

/**
 * Interface for the scoring system.
 * The scoring system is used for deciding the score after finishing the quiz.
 */
public interface IScoring {

    /**
     * Method for calculating the score according to three parameters.
     *
     * @param amount_correct_questions The amount of correct questions that the player has answered for a quiz.
     * @param length_word The length of the word that the player managed to form from the letters that match the correct answered questions.
     * @param time The total time needed to finish the quiz.
     * @return The total score according to the three parameters above.
     */
    int calculateScore(int amount_correct_questions, int length_word, long time);
}
