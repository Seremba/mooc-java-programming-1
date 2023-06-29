
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classe
        Statistics statistics = new Statistics();
        
        UserInterface ui = new UserInterface(statistics, scanner);
        ui.start();
    }
}
