
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
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                this.birdDatabase.addBird(scanner);
            } else if (command.equals("Observation")) {
                
                this.birdDatabase.observeBird(scanner);
            } else if (command.equals("All")) {
                this.birdDatabase.retrieveAllBirds();
            } else if (command.equals("One")) {
                
                this.birdDatabase.retrieveOneBird(scanner);
            } else {
                System.out.println("Not a valid command!!");
            }
        }
    }
    
}
