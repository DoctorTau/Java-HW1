import java.util.Scanner;

public class ConsonantsAndVowels {
    static Scanner in = new Scanner(System.in);

    static Pair<Integer, Integer> countConsonantsAndVowels(String s) {
        int consonants = 0, vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = Character.toLowerCase(s.charAt(i));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        return new Pair<Integer, Integer>(consonants, vowels);
    }

    public static void main(String[] args) {
        String word;
        word = in.nextLine();

        Pair<Integer, Integer> consonantsVowels = countConsonantsAndVowels(word);

        System.out.println("Vowels: " + consonantsVowels.second + "\nConsonants: " + consonantsVowels.first);
    }
}
