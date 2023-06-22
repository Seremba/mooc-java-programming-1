
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                int num = Integer.valueOf(scan.nextLine());
                numbers.add(num);
            }
            int total = 0;
            for (Integer number : numbers) {
                if (number >= lowerBound && number <= upperBound) {
                    total += 1;
                }
            }
            System.out.println("Numbers: " + total);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
