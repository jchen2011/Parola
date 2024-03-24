package utils;

import java.util.List;

public class ListUtils {

    /**
     * Method to check if the given letter is inside the {@link List}.
     * The difference is that it is now checked case-insensitive.
     *
     * @param letters The given letter to the player from the quiz.
     * @param s The letter that needs to be checked if it is inside the {@link List}.
     * @return Data as a {@link Boolean}. Either true or false.
     */
    public static boolean containsIgnoreCase(List<String> letters, String s) {
        for (String letter : letters) {
            if (letter.equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    }
}
