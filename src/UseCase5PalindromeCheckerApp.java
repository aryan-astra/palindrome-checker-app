import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters to form reversed string (LIFO order)
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        boolean isPalindrome = input.equals(reversed.toString());

        System.out.println("Input          : " + input);
        System.out.println("Reversed       : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
