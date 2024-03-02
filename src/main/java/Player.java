import java.util.ArrayList;

public class Player {
    private String username;
    private int credits;
    private float balance;

    private ArrayList<String> letters;

    public Player(String username) {
        this.username = username;
        this.credits = 1000;
        this.letters = new ArrayList<>();
    }

    public void deductCredits(int amount) {
        this.credits -= amount;
    }

    public void addLetter(String letter) {
        this.letters.add(letter);
    }

    public String showLetters() {
        if (letters.isEmpty()) {
            return "You got 0 letters";
        }

        StringBuilder s = new StringBuilder();
        for (String l : letters) {
            s.append(l + ",");
        }
        return s.toString();
    }

    public void reset() {
        this.letters.clear();
    }
}
