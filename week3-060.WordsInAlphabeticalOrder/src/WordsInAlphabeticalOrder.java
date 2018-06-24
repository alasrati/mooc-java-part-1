import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                Collections.sort(words);
                printWords(words);
                break;
            } else {
                words.add(word);
            }
        }
    }

    public static void printWords(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
