public class UseCase13PalindromeCheckerApp {

    // Approach 1: String Reverse using StringBuilder
    static boolean checkUsingStringReverse(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // Approach 2: Character Array with Two-Pointer
    static boolean checkUsingCharArray(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    // Approach 3: Recursion
    static boolean checkUsingRecursion(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return checkUsingRecursion(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "racecar";
        int iterations = 100000;
        long start, end, duration;

        // Benchmark: String Reverse
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) checkUsingStringReverse(input);
        end = System.nanoTime();
        System.out.println("String Reverse  : " + (end - start) + " ns for " + iterations + " iterations");

        // Benchmark: Char Array (Two-Pointer)
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) checkUsingCharArray(input);
        end = System.nanoTime();
        System.out.println("Char Array      : " + (end - start) + " ns for " + iterations + " iterations");

        // Benchmark: Recursion
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) checkUsingRecursion(input, 0, input.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursion       : " + (end - start) + " ns for " + iterations + " iterations");
    }
}
