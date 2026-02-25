import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// Strategy interface
interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return word.equals(reversed);
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String word) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class
class PalindromeContext {
    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String word) {
        if (strategy == null) {
            throw new IllegalStateException("No strategy set!");
        }
        return strategy.isPalindrome(word);
    }
}

// Main application
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "rotor";

        // Create context
        PalindromeContext context = new PalindromeContext();

        // Step 1: Choose Stack strategy dynamically
        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy:");
        System.out.println(word + " -> " + (context.executeStrategy(word) ? "Palindrome" : "Not Palindrome"));

        // Step 2: Choose Deque strategy dynamically
        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy:");
        System.out.println(word + " -> " + (context.executeStrategy(word) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Program executed successfully!");
    }
}