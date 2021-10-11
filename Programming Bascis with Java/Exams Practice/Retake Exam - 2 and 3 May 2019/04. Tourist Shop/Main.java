import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        int count = 0;

        String input = scanner.nextLine();
        while (!("Stop".equals(input))) {
            double price = Double.parseDouble(scanner.nextLine());

            count++;

            if (count % 3 == 0) {
                price *= 0.5;
            }

            sum += price;

            if (sum > budget) {
                break;
            }

            input = scanner.nextLine();
        }

        if ("Stop".equals(input)) {
            System.out.printf("You bought %d products for %.2f leva.", count, sum);
        } else {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", sum - budget);
        }

    }
}



