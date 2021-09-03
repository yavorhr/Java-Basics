import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermensCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                if (fishermensCount % 2 == 0) {
                    price = price * 0.95;
                }
                break;
            case "Summer":
                price = 4200;
                if (fishermensCount % 2 == 0) {
                    price = price * 0.95;
                }
                break;
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                if (fishermensCount % 2 == 0) {
                    price = price * 0.95;
                }
                break;
        }
        if (fishermensCount <= 6) {
            price = price * 0.9;
        } else if (fishermensCount > 7 && fishermensCount <= 11) {
            price = price * 0.85;
        } else {
            price = price * 0.75;
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }

    }
}
