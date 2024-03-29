package scoring;

public class HANScoringFactory extends ScoringFactory{
    @Override
    public IScoring createScoring(String type) {
        return switch (type) {
            case "hard" -> new HANHardScoring();
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}
