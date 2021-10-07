import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (guests >= 10 && guests <= 15) {
            price = 0.85 * price;
        } else if (guests > 15 && guests <= 20) {
            price = 0.8 * price;
        } else if (guests > 20) {
            price = 0.75 * price;
        }

        double sum = price * guests;
        double cake = 0.1 * budget;

        double total = sum + cake;

        if (total <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - total);
        } else {
            System.out.printf("No party! %.2f leva needed.", Math.abs(budget - total));
        }

    }
}
