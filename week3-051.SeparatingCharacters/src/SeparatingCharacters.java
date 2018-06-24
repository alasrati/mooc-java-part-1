
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        for (char c: name.toCharArray()) {
            System.out.println(i + ". character: " + c);
            i++;
        }
    }
}
