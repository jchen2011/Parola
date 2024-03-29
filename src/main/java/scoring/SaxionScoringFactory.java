package scoring;

public class SaxionScoringFactory extends ScoringFactory{
    @Override
    public IScoring createScoring(String type) {
        return switch (type) {
            case "hard" -> new SaxionHardScoring();
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}
