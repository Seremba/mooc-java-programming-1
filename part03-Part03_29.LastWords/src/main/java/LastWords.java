
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.isEmpty()) {
                break;
            }
            String[] words = sentence.split(" ");
            System.out.println(words[words.length - 1]);
        }

    }
}
