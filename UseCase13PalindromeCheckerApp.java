import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Stack-based palindrome check
    public static boolean stackPalindrome(String word) {
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

    // Deque-based palindrome check
    public static boolean dequePalindrome(String word) {
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

    // Simple reverse string palindrome check
    public static boolean simpleReversePalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "rotorrotorrotorrotor"; // longer word to see timing difference

        // Stack-based timing
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(word);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // Deque-based timing
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(word);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        // Simple reverse string timing
        long startSimple = System.nanoTime();
        boolean simpleResult = simpleReversePalindrome(word);
        long endSimple = System.nanoTime();
        long simpleTime = endSimple - startSimple;

        // Display results
        System.out.println("Performance Comparison for word: " + word);
        System.out.println("Stack-based: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque-based: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Simple Reverse: " + simpleResult + " | Time: " + simpleTime + " ns");

        System.out.println("Program executed successfully!");
    }
}