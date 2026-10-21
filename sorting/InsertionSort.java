// InsertionSort: simple beginner-friendly example.
public class InsertionSort {
    public static void main(String[] args) {
        int[] values = {9, 5, 1, 4, 3}; for (int i = 1; i < values.length; i++) { int key = values[i], j = i - 1; while (j >= 0 && values[j] < key) { values[j + 1] = values[j]; j--; } values[j + 1] = key; } System.out.println(java.util.Arrays.toString(values));
    }
}
