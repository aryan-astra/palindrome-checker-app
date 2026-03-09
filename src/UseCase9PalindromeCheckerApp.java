public class UseCase9PalindromeCheckerApp {

    // Recursive method: compares characters from both ends moving inward
    static boolean isPalindrome(String s, int start, int end) {
        // Base condition: pointers have crossed or met — it's a palindrome
        if (start >= end) return true;
        // If characters at current positions don't match, not a palindrome
        if (s.charAt(start) != s.charAt(end)) return false;
        // Recursive call moving inward
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "racecar";
        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
