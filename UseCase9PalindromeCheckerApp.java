public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base case: If start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at start and end do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call: check inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "level";

        // Step 1: Call recursive function
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully!");
    }
}