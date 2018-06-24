
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String word1 = reader.nextLine();
        System.out.print("Type the second word: ");
        String word2 = reader.nextLine();
        if (word1.indexOf(word2) == -1) {
            System.out.println(String.format("The word '%s' is not found in the word '%s'.", word2, word1));
        } else {
            System.out.println(String.format("The word '%s' is found in the word '%s'.", word2, word1));
        }
    }
}
