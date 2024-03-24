package scoring;

public class HardScoring implements IScoring{
    @Override
    public int calculateScore(int amount_correct_questions, int length_word, long time) {
        return (amount_correct_questions + 1) + (length_word + 1) + ((int) time + 1);
    }
}
