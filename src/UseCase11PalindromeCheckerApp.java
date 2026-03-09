public class UseCase11PalindromeCheckerApp {

    // Encapsulated palindrome checker — Single Responsibility Principle
    static class PalindromeChecker {

        // Checks if the given input is a palindrome (ignores case and non-alphanumeric characters)
        public boolean checkPalindrome(String input) {
            String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversed = new StringBuilder(normalized).reverse().toString();
            return normalized.equals(reversed);
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        String[] testWords = {"madam", "hello", "racecar", "A man a plan a canal Panama"};

        for (String word : testWords) {
            System.out.println("Input: \"" + word + "\" -> Is Palindrome? " + checker.checkPalindrome(word));
        }
    }
}
