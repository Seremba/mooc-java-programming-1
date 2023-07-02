
import java.nio.file.Paths;
import java.util.ArrayList;
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


public class RecipeController {
    
    private ArrayList<String> ingredients;
    private ArrayList<Recipe> recipes;
    
    public RecipeController() {
        this.ingredients = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }
    
    public void readRecipe(String fileName) {
        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                String recipeName = input.nextLine();
                int cookingTime = Integer.valueOf(input.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipes.add(recipe);
                while (input.hasNextLine()) {
                    String ingredient = input.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }  
                    recipe.addIngredient(ingredient);
                }            
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findName(String name) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime(int maxCookingTime) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }   
    
    public void findIngredient(String ingredient) {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getIngredients().contains(ingredient)) {
                System.out.println(recipes.get(i));
            }
        }
    }
}

