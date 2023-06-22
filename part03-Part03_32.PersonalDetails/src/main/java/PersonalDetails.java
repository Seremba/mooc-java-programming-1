
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> yearList = new ArrayList<>();

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] words = sentence.split(",");
            String name = words[0];
            int year = Integer.valueOf(words[1]);
            nameList.add(name);
            yearList.add(year);
        }
        int sum = 0;
        int total = 0;
        double average = 0;
        String longestName = nameList.get(0);

        for (int i = 0; i < yearList.size(); i++) {
            if (longestName.length() < nameList.get(i).length()) {
                longestName = nameList.get(i);
            }
            sum += yearList.get(i);
            total += 1;
            average = 1.0 * sum / total;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
