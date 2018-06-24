
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        double r = Float.parseFloat(reader.nextLine());
        double circumference = 2 * Math.PI * r;
        System.out.print("\n\nCircumference of the circle: " + circumference);
    }
}
