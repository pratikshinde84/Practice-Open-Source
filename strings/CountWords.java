// CountWords: simple beginner-friendly example.
public class CountWords {
    public static void main(String[] args) {
        String input = "Java is fun"; String trimmed = input.trim(); int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length; System.out.println("Words = " + words);
    }
}
