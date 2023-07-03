import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    private boolean foundBird;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
        this.foundBird = false;
    }
    
    public void addBird(Scanner input) {
        System.out.print("Name: ");
        String birdName = input.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = input.nextLine();
        birds.add(new Bird(birdName, latinName));
    }
    
    public void observeBird(Scanner input) {
        System.out.print("Bird? ");
        String birdName = input.nextLine();
        for (Bird bird : this.birds) {
            if (birdName.equals(bird.getName())) {
                bird.observations();
                foundBird = true;
            } 
        }
        
        if (!foundBird) {
            System.out.println("Not a bird!");
        }
    }
    
    public void retrieveAllBirds() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    
    public void retrieveOneBird(Scanner input) {
        System.out.print("Bird? ");
        String birdName = input.nextLine();
        for (Bird bird : this.birds) {
            if (bird.getName().contains(birdName)) {
                System.out.println(bird);
                foundBird = true;
            }
        } 
        
        if (!foundBird) {
            System.out.println("Not a bird!");
        }
    }
}
