// CountVowels: simple beginner-friendly example.
public class CountVowels {
    public static void main(String[] args) {
        String input = "Hello World".toLowerCase(); int count = 0; for (char letter : input.toCharArray()) if ("aeiou".indexOf(letter) == -1) count++; System.out.println("Vowels = " + count);
    }
}
