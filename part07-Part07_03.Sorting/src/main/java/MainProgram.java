
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] nums = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(nums));

        MainProgram.swap(nums, 1, 0);
        System.out.println(Arrays.toString(nums));

        MainProgram.swap(nums, 0, 3);
        System.out.println(Arrays.toString(nums));

    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];

            }
        }
        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int index = 0;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (smallest >= table[i]) {
                smallest = table[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        
    }
}
