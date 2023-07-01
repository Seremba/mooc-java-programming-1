
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

    private Statistics statistics;
    private Scanner scanner;

    public UserInterface(Statistics statistics, Scanner scanner) {
        this.statistics = statistics;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                break;
            }

            if (point >= 0 && point <= 100) {
                statistics.add(point);
            }

        }
        System.out.println("Point average (all): " + statistics.pointsAverage());
        
        if(statistics.passingPointsAverage() != 0){
            System.out.println("Point average (passing): " + statistics.passingPointsAverage());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + statistics.passPercentage());
         statistics.pointsAndGrade();
    }
}
