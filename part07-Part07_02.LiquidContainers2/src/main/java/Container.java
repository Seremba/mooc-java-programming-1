/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class Container {

    private int liquid;

    public Container() {
        this.liquid = 0;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount >= 0 && amount + liquid <= 100) {
            this.liquid += amount;
        } else {
            this.liquid = 100;
        }
    }

    public void remove(int amount) {
        if (liquid - amount >= 0 && liquid - amount <= 100) {
            this.liquid -= amount;
        } else {
            this.liquid = 0;
        }
    }

    public String toString() {
        return this.liquid + "/100";
    }
}
