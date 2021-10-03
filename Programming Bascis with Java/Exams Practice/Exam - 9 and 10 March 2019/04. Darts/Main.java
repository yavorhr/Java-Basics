import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPoints = 301;
        int counterGoodShots = 0;
        int counterBadShots = 0;
        String name = scanner.nextLine();

        String input = scanner.nextLine();
        while (!("Retire".equals(input))) {

            int points = Integer.parseInt(scanner.nextLine());

            if ("Single".equals(input)) {
                startPoints -= points;
                if (startPoints >= 0) {
                    counterGoodShots++;
                } else {
                    startPoints += points;
                    counterBadShots++;
                }
            } else if ("Double".equals(input)) {
                startPoints -= points * 2;
                if (startPoints >= 0) {
                    counterGoodShots++;
                } else {
                    startPoints += points * 2;
                    counterBadShots++;
                }
            } else if ("Triple".equals(input)) {
                startPoints -= points * 3;
                if (startPoints >= 0) {
                    counterGoodShots++;
                } else {
                    startPoints += points * 3;
                    counterBadShots++;
                }
            }
            if (startPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", name, counterGoodShots);
                break;
            }

            input = scanner.nextLine();
        }

        if ("Retire".equals(input)) {
            System.out.printf("%s retired after %d unsuccessful shots.", name, counterBadShots);
        }

    }
}


