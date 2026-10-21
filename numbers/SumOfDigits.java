// Find the sum of digits of a positive integer.
public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
