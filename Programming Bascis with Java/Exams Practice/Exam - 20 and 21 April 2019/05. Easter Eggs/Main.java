import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;
        int maxN = Integer.MIN_VALUE;

        for (int i = 0; i < eggs; i++) {
            String colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    redCount++;
                    break;
                case "orange":
                    orangeCount++;
                    break;
                case "blue":
                    blueCount++;
                    break;
                case "green":
                    greenCount++;
                    break;
            }
        }

        String colour = "";

        if (redCount > maxN) {
            maxN = redCount;
            colour = "red";
        }
        if (orangeCount > maxN) {
            maxN = orangeCount;
            colour = "orange";
        }
        if (blueCount > maxN) {
            maxN = blueCount;
            colour = "blue";
        }
        if (greenCount > maxN) {
            maxN = greenCount;
            colour = "green";
        }

        System.out.printf("Red eggs: %d%n", redCount);
        System.out.printf("Orange eggs: %d%n", orangeCount);
        System.out.printf("Blue eggs: %d%n", blueCount);
        System.out.printf("Green eggs: %d%n", greenCount);
        System.out.printf("Max eggs: %d -> %s", maxN, colour);
    }
}



