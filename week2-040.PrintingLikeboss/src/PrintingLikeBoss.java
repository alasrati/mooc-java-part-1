public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        while (stars <= size) {
            int amount = size - stars;
            printWhitespaces(amount);
            printStars(stars);
            stars++;
        }
    }

    public static void printTreeRow(int width, int stars) {
        int spaces = (width - stars) / 2;
        printWhitespaces(spaces);
        printStars(stars);
    }

    public static void xmasTree(int height) {
        int i = 1;
        int width = (2 * height) - 1;
        while (i <= height) {
            int stars = (2 * i) - 1;
            printTreeRow(width, stars);
            i++;
        }
        printTreeRow(width, 3);
        printTreeRow(width, 3);

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
