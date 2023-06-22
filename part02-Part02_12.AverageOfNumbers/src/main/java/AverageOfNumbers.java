
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int total = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }
            total += 1;
            sum += num;

            average = (double) sum / total;
        }

        System.out.println("Average of the numbers: " + average);
    }
}
