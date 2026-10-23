// Calculate the factorial of a small non-negative integer.
public class FactorialNumber {
    public static void main(String[] args) {
        int number = 4;
        int factorial = 1;
        for (int i = 1; i <=number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
//in this there are two issues that i is going upto 3 only that means the factorial is of n-1 but 
//when we give <= then loops goes for n times 