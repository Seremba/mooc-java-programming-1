
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int smallest = smallest(array);
        System.out.println(smallest);
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
}
