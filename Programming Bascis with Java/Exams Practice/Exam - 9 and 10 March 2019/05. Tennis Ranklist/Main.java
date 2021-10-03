import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int countWin = 0;
        int tournamentPoints = 0;

        for (int i = 0; i < tournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    countWin++;
                    tournamentPoints += 2000;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    break;
            }
        }
        double averagePoints = (tournamentPoints) * 1.0 / tournaments;
        double percentWins = countWin * 1.0 / tournaments * 100;

        System.out.printf("Final points: %d%n", startPoints + tournamentPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", percentWins);

    }
}



