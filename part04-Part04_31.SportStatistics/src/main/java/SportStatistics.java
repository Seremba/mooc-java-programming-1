
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Statistics> list = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String name = scan.nextLine();

        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String home = parts[0];
                String visit = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);

                list.add(new Statistics(home, visit, homePoints, visitPoints));
            }
            int total = 0;
            int losses = 0;
            int wins = 0;
            String winner = "";
            for (Statistics homeTeam : list) {
                if (homeTeam.getHomeTeam().equals(name) || homeTeam.getVisitingTeam().equals(name)) {
                    total += 1;
                    if (homeTeam.getHomeTeamPoints() > homeTeam.getVisitingTeamPoints()) {
                        winner = homeTeam.getHomeTeam();
                    }
                    if (homeTeam.getVisitingTeamPoints() > homeTeam.getHomeTeamPoints()) {
                        winner = homeTeam.getVisitingTeam();
                    }
                    if (winner.equals(name)) {
                        wins++;
                    }
                }

            }
            System.out.println("Games: " + total);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (total - wins));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
