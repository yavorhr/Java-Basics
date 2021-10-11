import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expiration = scanner.nextLine(); //one", или "two"
        String type = scanner.nextLine(); //"Small",  "Middle", "Large"или "ExtraLarge"
        String internetOption = scanner.nextLine();  // "yes" или "no"
        int months = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (expiration) {
            case "one":
                if (type.equals("Small")) {
                    price = 9.98;
                } else if (type.equals("Middle")) {
                    price = 18.99;
                } else if (type.equals("Large")) {
                    price = 25.98;
                } else if (type.equals("ExtraLarge")) {
                    price = 35.99;
                }
                break;

            case "two":
                if (type.equals("Small")) {
                    price = 8.58;
                } else if (type.equals("Middle")) {
                    price = 17.09;
                } else if (type.equals("Large")) {
                    price = 23.59;
                } else if (type.equals("ExtraLarge")) {
                    price = 31.79;
                }
                break;
        }

        if (internetOption.equals("yes")) {
            if (price <= 10) {
                price += 5.50;
            } else if (price <= 30) {
                price += 4.35;
            } else if (price > 30) {
                price += 3.85;
            }
        }

        double total = price * months;

        if (expiration.equals("two")) {
            total = total * 0.9625;
        }

        System.out.printf("%.2f lv.", total);

    }
}







