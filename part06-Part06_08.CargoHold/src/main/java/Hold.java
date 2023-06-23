
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
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int weight;

    public Hold(int weight) {
        this.weight = weight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int holdWeight = holdWeight();

        if (suitcase.totalWeight() + holdWeight <= weight) {
            this.suitcases.add(suitcase);
        }
    }

    public int holdWeight() {
        int holdWeight = 0;
        for (int i = 0; i < this.suitcases.size(); i++) {
            holdWeight += this.suitcases.get(i).totalWeight();
        }
        return holdWeight;
    }

    public void printItems() {
        for (Suitcase s : this.suitcases) {
            s.printItems();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.holdWeight() + " kg)";
    }
}
