
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Gimme a number: ");
            double d = Double.parseDouble(reader.nextLine());
            System.out.println();
            if (d >= -30 && d <= 40) {
                Graph.addNumber(d);
            }
        }
    }
}
