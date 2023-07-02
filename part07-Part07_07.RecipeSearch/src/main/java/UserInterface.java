
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
    private RecipeController recipeController;

    public UserInterface(Scanner scanner, RecipeController recipeController) {
        this.scanner = scanner;
        this.recipeController = recipeController;
    }

    public void start() {
        System.out.println("File to read:");
        String file = scanner.nextLine();
        recipeController.readRecipe(file);
        commands();
        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                recipeController.listRecipes();
            }
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String name = scanner.nextLine();
                recipeController.findName(name);
            }
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                recipeController.findCookingTime(cookingTime);
            }
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeController.findIngredient(ingredient);
            }
        }
    }

    public void commands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
}
