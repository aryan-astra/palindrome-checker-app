public class UseCase8PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        String input = "madam";

        // Build singly linked list from the string
        Node head = null, tail = null;
        for (char c : input.toCharArray()) {
            Node node = new Node(c);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        // Find the middle using fast and slow pointer technique
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list in-place
        Node prev = null, curr = slow;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare first half and reversed second half
        Node left = head, right = prev;
        boolean isPalindrome = true;
        while (right != null) {
            if (left.data != right.data) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
