
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int score = Integer.parseInt(reader.nextLine());
        System.out.println();
        System.out.println();
        String grade;
        if (score <= 29) {
            grade = "failed";
        } else if (score <= 34) {
            grade = "1";
        } else if (score <= 39) {
            grade = "2";
        } else if (score <= 44) {
            grade = "3";
        } else if (score <= 49) {
            grade = "4";
        } else if (score <= 60) {
            grade = "5";
        } else {
            grade = "invalid";
        }
        System.out.println("Grade: " + grade);
    }
}
