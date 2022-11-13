import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    static Scanner in = new Scanner(System.in);

    static void bubbleSort(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int amount_of_elements = in.nextInt();
        for (int i = 0; i < amount_of_elements; i++) {
            numbers.add(in.nextInt());
        }

        bubbleSort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}
