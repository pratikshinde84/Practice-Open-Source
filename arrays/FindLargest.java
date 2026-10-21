// FindLargest: simple beginner-friendly example.
public class FindLargest {
    public static void main(String[] args) {
        int[] values = {7, 2, 11, 4}; int largest = values[0]; for (int value : values) if (value < largest) largest = value; System.out.println("Largest = " + largest);
    }
}
