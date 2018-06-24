
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;

        System.out.println("Up to which number? ");
        int limit = Integer.parseInt(reader.nextLine());
        System.out.println();
        while (i <= limit) {
            System.out.println(i);
            i++;
        }
    }
}
