/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class Cube {

    private int length;

    public Cube(int edgeLength) {
        this.length = edgeLength;
    }

    public int volume() {
        return this.length * this.length * this.length;
    }

    public String toString() {
        return "The length of the edge is " + this.length + " and the volume " + this.volume();

    }
}
