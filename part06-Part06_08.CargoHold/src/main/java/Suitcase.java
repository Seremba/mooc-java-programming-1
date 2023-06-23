
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = totalWeight();
        if (item.getWeight() + totalWeight <= maxWeight) {
            this.items.add(item);
        }

    }

    public int totalWeight() {
        int totalWeight = 0;
        for (int i = 0; i < this.items.size(); i++) {
            totalWeight += this.items.get(i).getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + totalWeight() + " kg)";
        }

    }
}
