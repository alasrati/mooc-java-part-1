
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int i = Integer.parseInt(reader.nextLine());
        if (i % 2 == 0 ) {
            System.out.println(String.format("Number %s is even.", i));
        }
        else {
            System.out.println(String.format("Number %s is odd.", i));
        }

    }
}
