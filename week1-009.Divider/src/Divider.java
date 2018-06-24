
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("\nType another number: ");
        int b = Integer.parseInt(reader.nextLine());
        float result = a / (float) b;
        System.out.print(String.format("\n\nDivision: %s / %s = %s", a, b, result));
    }
}
