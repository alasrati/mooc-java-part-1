
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println();
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        System.out.println();
        while (first <= last) {
            sum += first;
            first++;
        }
        System.out.println("The sum is " + sum);
    }
}
