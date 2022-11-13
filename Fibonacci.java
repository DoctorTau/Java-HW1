import java.util.Scanner;

public class Fibonacci {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int first = 1, second = 1, amount_of_numbers;

        amount_of_numbers = in.nextInt();

        if (amount_of_numbers == 2) {
            System.out.println("1" + '\n' + "1");
        } else if (amount_of_numbers == 1) {
            System.out.println("1");
        } else {
            System.out.println(first + "\n" + second);
            for (int i = 3; i <= amount_of_numbers; i++) {
                int temp = first + second;
                first = second;
                second = temp;
                System.out.println(temp + " ");
            }
        }
    }
}
