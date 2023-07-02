
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
    private ArrayList<Recipe> repices;
    private ArrayList<String> ingredients; 

    public RecipeController() {
        this.repices = new ArrayList<>();
        this.ingredients = new ArrayList<>();
    }
    
    public void listRecipe(String file){
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                
                Recipe recipe = new Recipe(name, cookingTime);
                this.repices.add(recipe);
                while(scanner.hasNextLine()){
                    String ingredient = scanner.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    this.ingredients.add(ingredient);
                }
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void listRecipes(){
        
        for(Recipe recipe: this.repices) {
            System.out.println(recipe);
        }
    }
    public void findRecipeByName(String name) {
        for(Recipe recipe: this.repices) {
            if(recipe.getName().contains(name)){
                System.out.println(recipe);
            }
        }
    }
    public void searchByCookingTime(int maxCookingTime){
        for(Recipe recipe: this.repices){
            if(recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void searchByIngredient(String ingredient){
        for(Recipe recipe: this.repices){
            if(recipe.getIngredients().contains(ingredient)){
                System.out.println(recipe);
            }
        }
    }
    
}
