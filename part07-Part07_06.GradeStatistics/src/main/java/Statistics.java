
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
public class Statistics {

    private ArrayList<Integer> points;

    public Statistics() {
        this.points = new ArrayList<>();
    }

    public void add(int point) {

        this.points.add(point);

    }

    public double pointsAverage() {
        int sum = 0;
        double average = 0;

        for (Integer point : points) {
            sum += point;
            average = 1.0 * sum / points.size();
        }
        return average;
    }

    public double passingPointsAverage() {
        double sum = 0.0;
        int count = 0;
        for (Integer point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        if (count != 0) {
            return sum / count;
        }
        return 0.0;
    }

    public double passPercentage() {
        int total = 0;

        for (Integer point : points) {
            if (point >= 50) {
                total += 1;
            }
        }
        return 1.0 * (100 * total) / this.points.size();
    }

    public void pointsAndGrade() {
        ArrayList<Integer> grade = new ArrayList<>();
        for (Integer point : points) {
            if (point < 50) {
                grade.add(0);
            } else if (point < 60) {
                grade.add(1);
            } else if (point < 70) {
                grade.add(2);
            } else if (point < 80) {
                grade.add(3);
            } else if (point < 90) {
                grade.add(4);
            } else {
                grade.add(5);
            }
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + printStar(grade, i));
        }
    }

    private String printStar(ArrayList<Integer> grades, int i) {
        String star = "";
        for (Integer grade : grades) {
            if (grade == i) {
                star += "*";
            }
        }
        return star;
    }

}
