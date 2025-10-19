// PalindromeChecker.java
public class PalindromeChecker {
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is a palindrome
    public boolean isPalindrome() {
        String clean = text.toLowerCase();               // make comparison case‐insensitive
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        PalindromeChecker pc1 = new PalindromeChecker("level");
        PalindromeChecker pc2 = new PalindromeChecker("hello");

        pc1.displayResult();
        pc2.displayResult();
    }
}

