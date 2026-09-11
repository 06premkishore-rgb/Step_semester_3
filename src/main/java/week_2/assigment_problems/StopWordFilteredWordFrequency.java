package week2.assigment_problems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StopWordFilteredWordFrequency {

    static final String[] STOP_WORDS = {"the", "was", "and", "a", "is", "of", "in"};

    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }

    static void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.toLowerCase().replace(",", "").replace(".", "");

        String[] words = cleaned.split("\\s+");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (isStopWord(word)) continue;
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequency.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static boolean isStopWord(String word) {
        for (String stopWord : STOP_WORDS) {
            if (stopWord.equals(word)) return true;
        }
        return false;
    }
}