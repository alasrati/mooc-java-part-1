public class Printing {

    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        int i = sideSize;
        while (i > 0) {
            printStars(sideSize);
            i--;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = height;
        while (i > 0) {
            printStars(width);
            i--;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
