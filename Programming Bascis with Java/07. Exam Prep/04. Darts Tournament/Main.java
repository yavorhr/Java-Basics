import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPoints = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean quickWin = false;

        while (startPoints > 0) {
            String target = scanner.nextLine();
            if ("bullseye".equals(target)) {
                counter++;
                quickWin = true;
                break;
            }
            int currentPoints = Integer.parseInt(scanner.nextLine());
            counter++;

            switch (target) {
                case "number section":
                    break;
                case "double ring":
                    currentPoints *= 2;
                    break;
                case "triple ring":
                    currentPoints *= 3;
                    break;
            }
            startPoints -= currentPoints;
            if (startPoints <= 0) {
                break;

            }
        }

        if (quickWin) {
            System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", counter);
        } else if (startPoints == 0) {
            System.out.printf("Congratulations! You won the game in %d moves!", counter);
        } else {
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(startPoints));
        }

    }
}

