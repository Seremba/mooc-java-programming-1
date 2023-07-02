
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class UserInterface {

    private Scanner scanner;
    private BirdDatabase birdDatabase;

    public UserInterface(Scanner scanner, BirdDatabase birdDatabase) {
        this.scanner = scanner;
        this.birdDatabase = birdDatabase;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();
                this.birdDatabase.add(name, latin);
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                this.birdDatabase.observation(name);
            } else if (command.equals("all")) {
                this.birdDatabase.printBirdsInTheDatabse();
            } else if (command.equals("one")) {
                System.out.println("in printOneBird");
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                this.birdDatabase.printDatabaseBird(birdName);
            } else {
                System.out.println("Not a valid command!!");
            }
        }
    }

}
