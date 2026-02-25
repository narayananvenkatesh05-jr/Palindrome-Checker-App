import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "rotor";

        // Step 1: Initialize Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 2: Enqueue & push characters
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        // Step 3: Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully!");
    }
}