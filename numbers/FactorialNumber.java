// Calculate the factorial of a small non-negative integer.
public class FactorialNumber {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;
        for (int i = 2; i < number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
