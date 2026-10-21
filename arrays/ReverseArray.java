// ReverseArray: simple beginner-friendly example.
public class ReverseArray {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5}; for (int left = 0, right = values.length - 1; left < right; left++, right--) { int temp = values[left]; values[left] = values[right]; values[right] = temp; } System.out.println(java.util.Arrays.toString(values));
    }
}
