
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] words = sentence.split(",");
            int ages = Integer.valueOf(words[1]);
            list.add(ages);
        }
        int oldest = list.get(0);
        for (Integer age : list) {
            if (oldest < age) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
