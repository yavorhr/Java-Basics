import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int winsCount = 0;
        int drawCount = 0;
        int loseCount = 0;


        for (int i = 1; i <= games; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    points += 3;
                    winsCount++;
                    break;
                case "D":
                    points += 1;
                    drawCount++;
                    break;
                case "L":
                    points += 0;
                    loseCount++;
                    break;
            }
        }
        double totalGames = winsCount + drawCount + loseCount;
        double rate = (winsCount / totalGames) * 100;

        if (points == 0) {
            System.out.printf("%s hasn't played any games during this season.%n", name);
        } else {
            System.out.printf("%s has won %d points during this season.%n", name, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", winsCount);
            System.out.printf("## D: %d%n", drawCount);
            System.out.printf("## L: %d%n", loseCount);
            System.out.printf("Win rate: %.2f%%", rate);
        }

    }
}

