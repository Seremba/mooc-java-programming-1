
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
public class BirdDatabase {

    private ArrayList<Bird> database;

    public BirdDatabase() {
        this.database = new ArrayList<>();
    }

    public void add(String name, String latin){
        Bird bird = new Bird(name, latin);
        this.database.add(bird);
    }
    public void observation(String name){
        for(Bird bird: this.database){
            if(bird.getName().equals(name) || bird.getLatinName().equals(name)){
                bird.observations();
            }
        }
    }
    public void printDatabaseBird(String name){
        for(Bird bird : this.database){
            if(bird.getName().contains(name) || bird.getLatinName().contains(name)){
                System.out.println(bird);
            }
        }
    }
    
    public void printBirdsInTheDatabse(){
        for(Bird bird: this.database){
            System.out.println(bird);
        }
    }
}
