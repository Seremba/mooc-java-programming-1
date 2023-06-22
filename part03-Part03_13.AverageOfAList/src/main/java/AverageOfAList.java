
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            list.add(num);
        }
        int sum = 0;
        int total = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            total += 1;
            average = 1.0 * sum / total;
        }
        System.out.println("Average: " + average);
    }
}
