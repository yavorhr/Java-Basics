import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());

        int volleyballGameCount = 0;
        double volleyballScore = 0;

        int tennisGameCount = 0;
        double tennisScore = 0;

        int badmintonGameCount = 0;
        double badmintonScore = 0;

        for (int i = 0; i < games; i++) {
            String currentGame = scanner.nextLine();
            int points = Integer.parseInt(scanner.nextLine());

            switch (currentGame) {
                case "volleyball":
                    double currentPoints = points + points * 0.07;
                    volleyballScore += currentPoints;
                    volleyballGameCount++;
                    break;
                case "tennis":
                    currentPoints = points + points * 0.05;
                    tennisScore += currentPoints;
                    tennisGameCount++;
                    break;
                case "badminton":
                    currentPoints = points + points * 0.02;
                    badmintonScore += currentPoints;
                    badmintonGameCount++;
                    break;
            }
        }

        double averageVolleyball = volleyballScore / volleyballGameCount;
        double averageTennis = tennisScore / tennisGameCount;
        double averageBadminton = badmintonScore / badmintonGameCount;
        double allPoints = Math.floor(volleyballScore + tennisScore + badmintonScore);

        if (averageVolleyball > 75 && averageTennis > 75 && averageBadminton > 75) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", name, allPoints);
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", name, allPoints);
        }
    }
}



