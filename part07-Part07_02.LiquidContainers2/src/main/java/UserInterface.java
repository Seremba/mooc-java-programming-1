
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
public class UserInterface {

    private Scanner scanner;
    private Container container1;
    private Container container2;

    public UserInterface(Scanner scanner, Container container1, Container container2) {
        this.scanner = scanner;
        this.container1 = container1;
        this.container2 = container2;
    }

    public void start() {
        System.out.println("First: " + this.container1.toString());
        System.out.println("Second: " + this.container2.toString());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            commands(command, amount);
            System.out.println("First: " + this.container1.toString());
            System.out.println("Second: " + this.container2.toString());
        }

    }

    public void commands(String command, int amount) {
        if (command.equals("add")) {
            add(amount);
        } else if (command.equals("move")) {
            move(amount);
        } else if (command.equals("remove")) {
            remove(amount);
        }
    }

    public void add(int amount) {
        this.container1.add(amount);
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount > container1.contains()) {
                container2.add(container1.contains());
                container1.remove(amount);
            } else {
                container1.remove(amount);
                container2.add(amount);
            }
        }
    }

    private void remove(int amount) {
        this.container2.remove(amount);
    }

}
