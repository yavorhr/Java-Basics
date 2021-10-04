import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < series; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (name) {
                case "Thrones":
                    price *= 0.5;
                    budget -= price;
                    break;
                case "Lucifer":
                    price *= 0.6;
                    budget -= price;
                    break;
                case "Protector":
                    price *= 0.7;
                    budget -= price;
                    break;
                case "TotalDrama":
                    price *= 0.8;
                    budget -= price;
                    break;
                case "Area":
                    price *= 0.9;
                    budget -= price;
                    break;
                default:
                    budget -= price;
                    break;
            }
        }

        if (budget >= 0) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }

    }
}






