import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String extras = scanner.nextLine();
        String discountVIP = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        if (days > 7) {
            days = days - 1;
        }

        if (days < 1) {
            System.out.println("Days must be positive number!");
        }

        double price = 0.0;

        switch (city) {
            case "Bansko":
            case "Borovets":
                if (extras.equals("noEquipment")) {
                    price = 80 * days;
                } else if (extras.equals("withEquipment")) {
                    price = 100 * days;
                }
                break;
            case "Varna":
            case "Burgas":
                if (extras.equals("noBreakfast")) {
                    price = 100 * days;
                } else if (extras.equals("withBreakfast")) {
                    price = 130 * days;
                }
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        if (discountVIP.equals("yes")) {
            if (extras.equals("withEquipment")) {
                price = price * 0.9;
            } else if (extras.equals("noEquipment")) {
                price = price * 0.95;
            } else if (extras.equals("noBreakfast")) {
                price = price * 0.93;
            } else if (extras.equals("withBreakfast")) {
                price = price * 0.88;
            } else {
                System.out.println("Invalid input!");
            }
        }

        if (price > 0) {
            System.out.printf("The price is %.2flv! Have a nice time!", price);
        }

    }
}



