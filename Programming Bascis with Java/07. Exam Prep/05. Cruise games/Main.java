import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());

        double volleyPoints = 0;
        double tennisPoints = 0;

        double badmintonPoints = 0;
        double sumBadminton = 0;

        double sumTennis = 0;
        double sumVolley = 0;

        for (int i = 0; i < games; i++) {
            String gameName = scanner.nextLine();
            int points = Integer.parseInt(scanner.nextLine());

            switch (gameName) {
                case "volleyball":
                    double bonus = points * 0.07;
                    volleyPoints = bonus + points;
                    sumVolley += volleyPoints;
                    break;
                case "tennis":
                    bonus = points * 0.05;
                    tennisPoints = points + bonus;
                    sumTennis += tennisPoints;
                    break;
                case "badminton":
                    bonus = points * 0.02;
                    badmintonPoints = bonus + points;
                    sumBadminton += badmintonPoints;
                    break;
            }
        }
        double allPoints = Math.floor(sumVolley + sumBadminton + sumTennis);

        if (volleyPoints >= 75 && tennisPoints >= 75 && badmintonPoints >= 75) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", player, allPoints);
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", player, allPoints);
        }

    }
}



