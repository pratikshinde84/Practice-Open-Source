// CheckPrime: simple beginner-friendly example.
public class CheckPrime {
    public static void main(String[] args) {
        int number = 11;
        boolean prime = number > 1;
        for (int i = 2; i < number / 2; i++)
            if (number % i == 0) {
                prime = false;
                break;
            }
        System.out.println(prime ? "Prime" : "Not prime");
    }
}
