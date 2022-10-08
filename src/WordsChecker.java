import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {
    private String text;
    private HashSet words;

    public WordsChecker(String text) {
        this.text = text;
        String[] split = text.split("\\P{IsAlphabetic}+");
        words = new HashSet<>(Arrays.asList(split));
    }

    public boolean hasWord(String word) {
        boolean has = words.contains(word);
        return has;
    }
}
