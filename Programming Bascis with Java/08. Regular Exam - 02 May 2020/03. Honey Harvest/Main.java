import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();         //Sunflower", "Daisy", "Lavender", "Mint".
        int flowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();             //"Spring", "Summer", "Autumn"].

        double honeyHarvested = 0;

        if (season.equals("Spring")) {
            switch (flowerType) {
                case "Sunflower":
                    honeyHarvested = flowers * 10;
                    break;
                case "Daisy":
                    honeyHarvested = 12 * flowers;
                    honeyHarvested = honeyHarvested + honeyHarvested * 0.1;
                    break;
                case "Lavender":
                    honeyHarvested = 12 * flowers;
                    break;
                case "Mint":
                    honeyHarvested = 10 * flowers;
                    honeyHarvested = honeyHarvested + honeyHarvested * 0.1;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (flowerType) {
                case "Sunflower":
                    honeyHarvested = flowers * 8;
                    break;
                case "Daisy":
                    honeyHarvested = 8 * flowers;
                    break;
                case "Lavender":
                    honeyHarvested = 8 * flowers;
                    break;
                case "Mint":
                    honeyHarvested = 12 * flowers;
                    break;
            }
        } else if (season.equals("Autumn")) {
            switch (flowerType) {
                case "Sunflower":
                    honeyHarvested = flowers * 12;
                    break;
                case "Daisy":
                    honeyHarvested = 6 * flowers;
                    break;
                case "Lavender":
                    honeyHarvested = 6 * flowers;
                    break;
                case "Mint":
                    honeyHarvested = 6 * flowers;
                    break;
            }
        }

        if (season.equals("Summer")) {
            honeyHarvested = honeyHarvested + (honeyHarvested * 0.1);
        } else if (season.equals("Autumn")) {
            honeyHarvested = honeyHarvested - (honeyHarvested * 0.05);
        }

        System.out.printf("Total honey harvested: %.2f", honeyHarvested);
    }
}


