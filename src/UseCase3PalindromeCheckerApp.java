public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = "";

        // Reverse the string using a for loop (String concatenation)
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original : " + original);
        System.out.println("Reversed : " + reversed);

        // Compare original with reversed using equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
    }
}
