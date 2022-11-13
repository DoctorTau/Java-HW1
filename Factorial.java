import java.util.Scanner;

public class Factorial {
    static Scanner in = new Scanner(System.in);

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number;
        number = in.nextInt();
        System.out.println(factorial(number));
    }
}
