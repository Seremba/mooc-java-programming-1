
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] words = sentence.split(",");
            String name = words[0];
            Integer age = Integer.valueOf(words[1]);

            nameList.add(name);
            ageList.add(age);
        }
        int oldest = ageList.get(0);
        String name = nameList.get(0);
        for (int i = 0; i < ageList.size(); i++) {
            if (oldest < ageList.get(i)) {
                oldest = ageList.get(i);
                name = nameList.get(i);
            }
        }
        System.out.println("Age of the oldest: " + name);

    }
}
