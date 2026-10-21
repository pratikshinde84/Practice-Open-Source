// BubbleSort: simple beginner-friendly example.
public class BubbleSort {
    public static void main(String[] args) {
        int[] values = {5, 1, 4, 2, 8}; for (int i = 0; i < values.length - 1; i++) for (int j = 0; j < values.length - i - 1; j++) if (values[j] > values[j + 1]) { int temp = values[j]; values[j] = values[j + 1]; values[j + 1] = temp; } System.out.println(java.util.Arrays.toString(values));
    }
}
