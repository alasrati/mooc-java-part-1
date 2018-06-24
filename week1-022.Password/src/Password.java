
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        boolean incorrect = true;
        while (incorrect) {
            System.out.print("Type the password: ");
            String guess = reader.nextLine();
            if (guess.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: gerrymanderer");
                incorrect = false;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
