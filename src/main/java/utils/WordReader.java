package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WordReader {
    private String systemProperty;
    private String filePath;
    private String file;

    public WordReader() {
        this.systemProperty = System.getProperty("user.dir");
        this.filePath = "\\src\\main\\java\\utils\\";
        this.file = "words.txt";
    }

    /**
     * Method to check if the given word is in the dictionary.
     * This is done case-insensitive.
     *
     * @param word The given word that needs to be checked if it is in the dictionary.
     * @return Data as a {@link Boolean}. Either true or false.
     */
    public boolean isInDictionary(String word) {
        try {
            return Files.lines(Paths.get( systemProperty + filePath + file)).anyMatch(l -> l.contains(word));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false;
        }
    }

    /**
     * Method to check if the word is also possible from the given letters.
     * It is possible to have the right word, but not the right given letters.
     * An example: you gave the word 'dog', but the given letters are 'A, B, C'. This will return to False.
     *
     * @param word The formulated word by the player.
     * @param givenLetters The letters that the player has received from playing the quiz.
     * @return Data as a {@link Boolean}. Either true or false.
     */
    public boolean isInGivenLetters(String word, List<String> givenLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (!ListUtils.containsIgnoreCase(givenLetters, String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the word is in the dictionary and possible to form as a word. If so, then it will return the length of the formulated word.
     * Otherwise, it will return 0 as a score.
     *
     * @param word The formulated word by the player.
     * @param givenLetters The letters that the player has received from playing the quiz.
     * @return
     */
    public int getScore(String word, List<String> givenLetters) {
        if (isInDictionary(word) && isInGivenLetters(word, givenLetters)) {
            return word.length();
        }
        return 0;
    }
}
