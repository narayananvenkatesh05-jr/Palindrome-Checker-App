public class UseCase10PalindromeCheckerApp {

    // Function to check palindrome
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        // Hardcoded string to check (can include spaces & mixed case)
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string: remove spaces & convert to lower case
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println("The phrase \"" + input + "\" is a Palindrome (case & space ignored).");
        } else {
            System.out.println("The phrase \"" + input + "\" is NOT a Palindrome (case & space ignored).");
        }

        System.out.println("Program executed successfully!");
    }
}