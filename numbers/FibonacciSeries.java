// Print the first ten terms of the Fibonacci sequence.
public class FibonacciSeries {
    public static void main(String[] args) {
        int terms = 10;
        int first = 0, second = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
