import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int[] gradeCounts = new int[6];
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:");
        int score = 0;
        while (true) {
            score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            }
            scores.add(score);
            if (score < 0) {
                ;
            } else if (score <= 29) {
                gradeCounts[0]++;
            } else if (score <= 34) {
                gradeCounts[1]++;
            } else if (score <= 39) {
                gradeCounts[2]++;
            } else if (score <= 44) {
                gradeCounts[3]++;
            } else if (score <= 49) {
                gradeCounts[4]++;
            } else if (score <= 60) {
                gradeCounts[5]++;
            } else {
                ;
            }
        }


        System.out.println("Grade distribution");
        int sum = 0;
        for (
                int i = gradeCounts.length - 1;
                i >= 0; i--)

        {
            System.out.print(i + ": ");
            sum += gradeCounts[i];
            for (int j = 1; j <= gradeCounts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int accepted = sum - gradeCounts[0];
        double acceptedPercentage = (100.0 * accepted) / sum;
        System.out.println("Accepted percentage: " + acceptedPercentage);
    }
}
