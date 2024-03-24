package scoring;

public interface IScoring {
    int calculateScore(int amount_correct_questions, int length_word, long time);
}
