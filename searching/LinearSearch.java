// LinearSearch: simple beginner-friendly example.
public class LinearSearch {
    public static void main(String[] args) {
        int[] values = {4, 8, 15, 16}; int target = 15, index = -1; for (int i = 0; i < values.length; i++) if (values[i] == target) { index = i + 1; break; } System.out.println("Index = " + index);
    }
}
