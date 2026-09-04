package week1.class_problems;
public class PalindromeChecker {

    public static void main(String[] args) {
        String[] testInputs = {"madam", "hello"};

        for (String text : testInputs) {
            boolean iterative = isPalindromeIterative(text);
            boolean recursive = isPalindromeRecursive(text);
            boolean arrayReversal = isPalindromeArrayReversal(text);

            System.out.println("Input: \"" + text + "\"");
            System.out.println("Iterative: " + (iterative ? "Palindrome" : "Not Palindrome")
                    + " | Recursive: " + (recursive ? "Palindrome" : "Not Palindrome")
                    + " | Array Reversal: " + (arrayReversal ? "Palindrome" : "Not Palindrome"));
            System.out.println();
        }
    }

    // Approach 1: Iterative - compare from both ends
    static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Approach 2: Recursive - shrink substring each call
    static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) return true;
        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    // Approach 3: Array reversal - reverse char array and compare
    static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        return new String(original).equals(new String(reversed));
    }
}