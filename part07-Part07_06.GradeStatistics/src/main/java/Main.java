
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int total = 0;
        int sum = 0;
        double passing = 0;
        double avg = 0;
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points >= 0 && points <= 100) {
                sum += points;
                total += 1;
                avg = 1.0 * sum / total;
            }
            if (points >= 0 && points <= 100) {
                if (points >= 50) {
                    sum += points;
                    total += 1;
                    passing = 1.0 * sum / total;
                } else {
                    System.out.println("Point average (passing): -");
                }
            }
        }
        System.out.println("Point average (all): " + avg);

    }
}
