// CountEvenOdd: simple beginner-friendly example.
public class CountEvenOdd {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6}; int even = 0, odd = 0; for (int value : values) { if (value % 2 != 0) even++; else odd++; } System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
