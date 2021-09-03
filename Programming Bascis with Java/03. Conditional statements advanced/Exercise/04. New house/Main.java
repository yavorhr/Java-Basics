import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double discount = 0;
        double price = 0;

        switch (flower) {
            case "Roses":
                if (quantity > 80) {
                    discount = 0.1 * (quantity * 5);
                    price = (quantity * 5) - discount;
                } else {
                    price = quantity * 5;
                }
                break;
            case "Dahlias":
                if (quantity > 90) {
                    discount = 0.15 * (quantity * 3.80);
                    price = (quantity * 3.80) - discount;
                } else {
                    price = quantity * 3.80;
                }
                break;
            case "Tulips":
                if (quantity > 80) {
                    discount = 0.15 * (quantity * 2.80);
                    price = (quantity * 2.80) - discount;
                } else {
                    price = quantity * 2.80;
                }
                break;
            case "Narcissus":
                if (quantity < 120) {
                    discount = 0.15 * (quantity * 3);
                    price = discount + (quantity * 3);
                } else {
                    price = quantity * 3;
                }
                break;
            case "Gladiolus":
                if (quantity < 80) {
                    discount = 0.20 * (quantity * 2.50);
                    price = discount + (quantity * 2.50);
                } else {
                    price = quantity * 2.50;
                }
                break;
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flower, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }

    }
}
