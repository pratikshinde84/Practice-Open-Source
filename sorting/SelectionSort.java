// SelectionSort: simple beginner-friendly example.
public class SelectionSort {
    public static void main(String[] args) {
        int[] values = {64, 25, 12, 22, 11}; for (int i = 0; i < values.length - 1; i++) { int min = i; for (int j = i + 1; j < values.length; j++) if (values[j] < values[min]) min = j; int temp = values[i]; values[i] = values[min]; values[min] = temp; } System.out.println(java.util.Arrays.toString(values));
    }
}
