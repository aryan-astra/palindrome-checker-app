public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Two-pointer technique: compare start and end characters
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
