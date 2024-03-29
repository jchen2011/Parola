package scoring;

public class SaxionHardScoring implements IScoring{
    @Override
    public int calculateScore(int amount_correct_questions, int length_word, long time) {
        return (amount_correct_questions) * (length_word) * ((int) time);
    }
}
