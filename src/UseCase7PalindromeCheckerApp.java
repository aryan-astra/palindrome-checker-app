import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters at the rear of the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear elements until the deque has 0 or 1 element
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
