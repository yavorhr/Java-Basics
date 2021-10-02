import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        double income = 0;

        String input = scanner.nextLine();
        while (!("Party!".equals(input))) {
            int quantityCocktails = Integer.parseInt(scanner.nextLine());

            int length = input.length();
            double price = length * quantityCocktails;

            if (!(price % 2 == 0)) {
                price = price * 0.75;
            }
            income += price;
            target = target - price;

            if (target <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (input.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", target);
        } else {
            System.out.printf("Target acquired.%n");
        }

        System.out.printf("Club income - %.2f leva.", income);

    }
}

