import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i =0 ; i < array.length; i++) {
            if (array[i] == smallest) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        return indexOfTheSmallest(Arrays.copyOfRange(array, index, array.length)) + index;
    }

    public static void swap(int[] array, int index1, int index2){
        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;
    }

    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i=0 ; i < array.length ; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
