package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String words : origin) {
            check.add(words);
        }
        for (String word : text) {
            if (!check.contains(word)) {
                return false;
            }
        }
        return rsl;
    }
}
