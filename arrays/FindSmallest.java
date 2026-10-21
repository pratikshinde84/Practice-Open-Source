// FindSmallest: simple beginner-friendly example.
public class FindSmallest {
    public static void main(String[] args) {
        int[] values = {7, 2, 11, 4}; int smallest = values[0]; for (int value : values) if (value > smallest) smallest = value; System.out.println("Smallest = " + smallest);
    }
}
