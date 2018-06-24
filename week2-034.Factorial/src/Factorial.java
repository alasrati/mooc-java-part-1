import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factorial = 1;
        int i = 1;

        System.out.print("Type a number: ");
        int j = Integer.parseInt(reader.nextLine());
        System.out.println();

        while (i <= j) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial is " + factorial);

    }
}
