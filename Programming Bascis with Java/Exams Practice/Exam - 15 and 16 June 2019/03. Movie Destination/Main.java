import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (season) {
            case "Winter":
                if (destination.equals("Dubai")) {
                    price = days * 45000;
                } else if (destination.equals("Sofia")) {
                    price = days * 17000;
                } else if (destination.equals("London")) {
                    price = days * 24000;
                }
                break;
            case "Summer":
                if (destination.equals("Dubai")) {
                    price = days * 40000;
                } else if (destination.equals("Sofia")) {
                    price = days * 12500;
                } else if (destination.equals("London")) {
                    price = days * 20250;
                }
                break;
        }

        if (destination.equals("Dubai")) {
            price = price * 0.7;
        } else if (destination.equals("Sofia")) {
            price = price * 1.25;
        }

        if (price <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - price);
        } else {
            System.out.printf("The director needs %.2f leva more!", price - budget);
        }

    }
}



