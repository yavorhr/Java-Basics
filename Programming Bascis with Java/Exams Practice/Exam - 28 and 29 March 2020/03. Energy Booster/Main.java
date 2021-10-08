import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String pack = scanner.nextLine();
        int quantityOfPack = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (fruit) {
            case "Watermelon":
                if (pack.equals("small")) {
                    price = 56.00 * 2 * quantityOfPack;
                } else if (pack.equals("big")) {
                    price = 28.70 * 5 * quantityOfPack;
                }
                break;
            case "Mango":
                if (pack.equals("small")) {
                    price = 36.66 * 2 * quantityOfPack;
                } else if (pack.equals("big")) {
                    price = 19.60 * 5 * quantityOfPack;
                }
                break;
            case "Pineapple":
                if (pack.equals("small")) {
                    price = 42.10 * 2 * quantityOfPack;
                } else if (pack.equals("big")) {
                    price = 24.80 * 5 * quantityOfPack;
                }
                break;
            case "Raspberry":
                if (pack.equals("small")) {
                    price = 20 * 2 * quantityOfPack;
                } else if (pack.equals("big")) {
                    price = 15.20 * 5 * quantityOfPack;
                }
                break;
        }

        if (price >= 400 && price <= 1000) {
            price = price * 0.85;
        } else if (price > 1000) {
            price = price * 0.5;
        }

        System.out.printf("%.2f lv.", price);
    }
}
