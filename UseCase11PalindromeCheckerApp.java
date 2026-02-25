import java.util.Stack;

public class UseCase11PalindromeCheckerApp {

    // PalindromeChecker class encapsulates palindrome logic
    static class PalindromeChecker {

        // Method to check if a string is a palindrome
        public boolean checkPalindrome(String word) {
            if (word == null || word.isEmpty()) return false;

            Stack<Character> stack = new Stack<>();
            // Push all characters onto the stack
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }

            // Pop characters to build reversed string
            String reversed = "";
            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            return word.equals(reversed);
        }
    }

    public static void main(String[] args) {

        // Step 1: Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Step 2: Test with a hardcoded string
        String word = "deed";

        // Step 3: Call checkPalindrome() method
        if (checker.checkPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully!");
    }
}