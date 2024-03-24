import java.util.ArrayList;
import java.util.List;

public class Player {
    private String username;
    private int credits;
    private float balance;
    private List<String> letters;

    public Player(String username) {
        this.username = username;
        this.credits = 1000;
        this.balance = 0;
        this.letters = new ArrayList<>();
    }

    public void deductCredits(int amount) {
        if (credits >= amount) {
            this.credits -= amount;
        } else {
            throw new IllegalStateException("Insufficient credits");
        }
    }

    public void addLetter(String letter) {
        this.letters.add(letter);
    }

    public String showLetters() {
        if (letters.isEmpty()) {
            return "You got 0 letters";
        }

        return String.join(",", letters);
    }

    public boolean isUsernamePresent(String username) {
        return this.username.equalsIgnoreCase(username);
    }
    public List<String> getLetters() {
        return letters;
    }
}
