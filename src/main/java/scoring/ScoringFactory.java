package scoring;

public abstract class ScoringFactory {
    public abstract IScoring createScoring(String type);
}
