
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class Recipe {

    private int name;
    private String cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(int name, String cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public int getName() {
        return name;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

}
