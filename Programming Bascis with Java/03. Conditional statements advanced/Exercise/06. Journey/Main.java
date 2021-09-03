import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");
        } else {
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", budget * 0.9);
        }

        if (budget <= 100) {
            switch (season) {
                case "summer":
                    System.out.printf("Camp - %.2f", budget * 0.3);
                    break;
                case "winter":
                    System.out.printf("Hotel - %.2f", budget * 0.7);
                    break;
            }
        } else if (budget <= 1000) {
            switch (season) {
                case "summer":
                    System.out.printf("Camp - %.2f", budget * 0.4);
                    break;
                case "winter":
                    System.out.printf("Hotel - %.2f", budget * 0.8);
                    break;
            }
        }

    }
}
