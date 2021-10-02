import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String type = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (drink) {
            case "Espresso":
                if (type.equals("Without")) {
                    price = quantity * 0.90;
                } else if (type.equals("Normal")) {
                    price = quantity * 1;
                } else if (type.equals("Extra")) {
                    price = quantity * 1.20;
                }
                break;

            case "Cappuccino":
                if (type.equals("Without")) {
                    price = quantity * 1;
                } else if (type.equals("Normal")) {
                    price = quantity * 1.20;
                } else if (type.equals("Extra")) {
                    price = quantity * 1.60;
                }
                break;
            case "Tea":
                if (type.equals("Without")) {
                    price = quantity * 0.50;
                } else if (type.equals("Normal")) {
                    price = quantity * 0.60;
                } else if (type.equals("Extra")) {
                    price = quantity * 0.70;
                }
                break;

        }
        if (type.equals("Without")) {
            price = price * 0.65;
        }

        if (drink.equals("Espresso") && quantity > 5) {
            price = price * 0.75;
        }

        if (price > 15) {
            price = price * 0.80;
        }


        System.out.printf("You bought %d cups of %s for %.2f lv.", quantity, drink, price);

    }
}
