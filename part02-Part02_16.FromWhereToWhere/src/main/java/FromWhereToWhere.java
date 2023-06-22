
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int num1 = Integer.valueOf(scanner.nextLine());
        // Write your program here
        for (int i = num1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
