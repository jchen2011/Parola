package utils;

import java.util.List;

public class ListUtils {

    public static boolean containsIgnoreCase(List<String> list, String s) {
        for (String letter : list) {
            if (letter.equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    }
}
