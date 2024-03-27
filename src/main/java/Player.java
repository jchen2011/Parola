import java.util.ArrayList;
import java.util.List;

public class Player {
    private String username;
    private int credits;
    private float balance;
    private List<String> letters;

    public Player(String username) {
        this.username = username;
        this.credits = 0;
        this.balance = 0;
        this.letters = new ArrayList<>();
    }

    /**
     * Deducts the amount from the player's credits.
     * Checks first if the player's credits is more than enough to deduct, otherwise there is an exception.
     *
     * @param amount The amount of credits that needs to be deducted.
     */
    public void deductCredits(int amount) {
        if (credits >= amount) {
            this.credits -= amount;
        } else {
            throw new IllegalStateException("Insufficient credits");
        }
    }

    public void addCredits(int amount) {
        this.credits += amount;
    }

    /**
     * Adds a letter to the player.
     *
     * @param letter The given letter that needs to be added in the list.
     */
    public void addLetter(String letter) {
        this.letters.add(letter);
    }

    /**
     * Shows all the letters that the player has received from playing the quiz.
     * If the player has 0 letters, then it will return a message with that the player has 0 letters.
     *
     * @return The letters divided with comma',' as a {@link String}.
     * An example is "T, S, D".
     */
    public String showLetters() {
        if (letters.isEmpty()) {
            return "You got 0 letters";
        }

        return String.join(",", letters);
    }

    /**
     * Checks if the player username is registered.
     *
     * @param username The username that needs to be checked.
     * @return Data as a {@link Boolean}. Either true or false.
     */
    public boolean isUsernamePresent(String username) {
        return this.username.equalsIgnoreCase(username);
    }

    /**
     * Gets all the letters from the player as a List.
     *
     * @return The list of all received letters to the player as a {@link List}.
     */
    public List<String> getLetters() {
        return letters;
    }
}
