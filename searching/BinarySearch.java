// BinarySearch: simple beginner-friendly example.
public class BinarySearch {
    public static void main(String[] args) {
        int[] values = {2, 4, 6, 8, 10}; int target = 8, left = 0, right = values.length - 1, index = -1; while (left <= right) { int middle = left + (right - left) / 2; if (values[middle] == target) { index = middle; break; } if (values[middle] < target) left = middle - 1; else right = middle - 1; } System.out.println("Index = " + index);
    }
}
