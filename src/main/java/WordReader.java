import utils.ListUtils;

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
        this.filePath = "\\src\\main\\java\\";
        this.file = "words.txt";
    }

    public boolean isInDictionary(String word) {
        try {
            return Files.lines(Paths.get( systemProperty + filePath + file)).anyMatch(l -> l.contains(word));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false;
        }
    }

    public int getScore(String word, List<String> givenLetters) {
        if (isInDictionary(word) && isInGivenLetters(word, givenLetters)) {
            return word.length();
        }
        return 0;
    }

    public boolean isInGivenLetters(String word, List<String> givenLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (!ListUtils.containsIgnoreCase(givenLetters, String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
