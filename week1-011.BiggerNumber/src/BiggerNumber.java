
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("\nType another number: ");
        int b = Integer.parseInt(reader.nextLine());
        int largest = Math.max(a, b);
        System.out.print("\n\nThe bigger number of the two numbers given was: " + largest);
    }
}
