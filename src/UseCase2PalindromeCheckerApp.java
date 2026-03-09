public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "madam";

        // Check palindrome using String reversal
        boolean isPalindrome = word.equals(new StringBuilder(word).reverse().toString());

        System.out.println("Input: " + word);
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}
