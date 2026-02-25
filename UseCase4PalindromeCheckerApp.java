public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "level";

        // Step 1: Convert string to character array
        char[] charArray = word.toCharArray();

        // Step 2: Use two-pointer approach
        boolean isPalindrome = true; // Assume it's a palindrome initially
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // No need to check further
            }
            start++;
            end--;
        }

        // Step 3: Display the result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully!");
    }
}