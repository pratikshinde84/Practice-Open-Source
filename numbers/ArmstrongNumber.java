// Check whether a positive number equals the sum of its digits raised to the number of digits.
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int digits = String.valueOf(number).length();
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }
        System.out.println(sum == number ? "Armstrong number" : "Not an Armstrong number");
    }
}
