import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine()); //2
        double totalSum = 0;

        for (int i = 0; i < clients; i++) {
            String purchase = scanner.nextLine(); //basket 1.50, wreath 3.80, chocolate bunny 7

            double sum = 0.0;
            int count = 0;

            while (!("Finish".equals(purchase))) {
                switch (purchase) {
                    case "basket":
                        sum += 1.50;
                        count++;
                        break;
                    case "wreath":
                        sum += 3.80;
                        count++;
                        break;
                    case "chocolate bunny":
                        sum += 7.00;
                        count++;
                        break;
                }
                purchase = scanner.nextLine();
            }

            if (count % 2 == 0) {
                sum -= 0.2 * sum;
            }
            totalSum = totalSum + sum;
            System.out.printf("You purchased %d items for %.2f leva.%n", count, sum);
        }

        double averageSum = totalSum / clients;
        System.out.printf("Average bill per client is: %.2f leva.%n", averageSum);
    }
}
