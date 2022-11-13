import java.util.Scanner;

public class ConsonantsAndVowels {
    static Scanner in = new Scanner(System.in);

    static int[] countConsonantsAndVowels(String s) {
        int consonants = 0, vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = Character.toLowerCase(s.charAt(i));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        return new int[] { consonants, vowels };
    }

    public static void main(String[] args) {
        String word;
        word = in.nextLine();

        int[] consonantsVowels = countConsonantsAndVowels(word);

        System.out.println("Vowels: " + consonantsVowels[1] + "\nConsonants: " + consonantsVowels[0]);
    }
}
