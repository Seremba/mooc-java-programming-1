
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();

        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double dbl = Double.valueOf(scan.nextLine());
        ;
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + dbl);
        System.out.println("You gave the boolean " + bool);
    }
}
