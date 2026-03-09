public class UseCase12PalindromeCheckerApp {

    // Strategy interface — defines the contract for all palindrome algorithms
    interface PalindromeStrategy {
        boolean check(String input);
    }

    // Concrete Strategy 1: Stack-based approach
    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            java.util.Stack<Character> stack = new java.util.Stack<>();
            for (char c : input.toCharArray()) stack.push(c);
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) reversed.append(stack.pop());
            return input.equals(reversed.toString());
        }
    }

    // Concrete Strategy 2: Deque-based approach
    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
            for (char c : input.toCharArray()) deque.addLast(c);
            while (deque.size() > 1) {
                if (!deque.pollFirst().equals(deque.pollLast())) return false;
            }
            return true;
        }
    }

    // Context class — uses a strategy injected at runtime (polymorphism)
    static class PalindromeChecker {
        private final PalindromeStrategy strategy;

        PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        boolean check(String input) {
            return strategy.check(input);
        }
    }

    public static void main(String[] args) {
        String input = "madam";

        PalindromeChecker stackChecker = new PalindromeChecker(new StackStrategy());
        System.out.println("Stack Strategy - \"" + input + "\" is Palindrome? " + stackChecker.check(input));

        PalindromeChecker dequeChecker = new PalindromeChecker(new DequeStrategy());
        System.out.println("Deque Strategy - \"" + input + "\" is Palindrome? " + dequeChecker.check(input));
    }
}
