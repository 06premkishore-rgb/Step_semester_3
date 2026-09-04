package week1.class_problems;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String[] testInputs = {"swiss", "aabbcc"};

        for (String text : testInputs) {
            char result = findFirstNonRepeatingChar(text);
            System.out.println("Input: \"" + text + "\"");
            if (result != '\0') {
                System.out.println("First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("No Non-Repeating Character Found");
            }
            System.out.println();
        }
    }

    static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        // Count frequency of every character
        for (char c : text.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        // Scan left to right for first char with frequency 1
        for (char c : text.toCharArray()) {
            if (frequency.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // sentinel: no non-repeating character found
    }
}