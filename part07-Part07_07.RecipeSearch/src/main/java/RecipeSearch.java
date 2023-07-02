
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
public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeController recipeController = new RecipeController();
        UserInterface ui = new UserInterface(scanner, recipeController);
        ui.start();
    }
}
