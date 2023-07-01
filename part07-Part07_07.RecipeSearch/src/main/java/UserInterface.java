
import java.nio.file.Paths;
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
    private Recipe recipe;

    public UserInterface(Scanner scanner, Recipe recipe) {
        this.scanner = scanner;
        this.recipe = recipe;
    }
    public void start(){
        System.out.println("File to read:");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        String file = scanner.nextLine();
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                
                
            }
        } catch(Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
