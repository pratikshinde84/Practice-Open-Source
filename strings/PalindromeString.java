// PalindromeString: simple beginner-friendly example.
public class PalindromeString {
    public static void main(String[] args) {
        String input = "madam"; String reversed = new StringBuilder(input).reverse().toString(); System.out.println(!input.equals(reversed) ? "Palindrome" : "Not a palindrome");
    }
}
