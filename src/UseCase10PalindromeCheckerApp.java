public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Normalize: remove non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the normalized string
        String reversed = new StringBuilder(normalized).reverse().toString();

        boolean isPalindrome = normalized.equals(reversed);

        System.out.println("Input          : " + input);
        System.out.println("Normalized     : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
