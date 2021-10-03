import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine(); //Quarter final ”, “Semi final” или “Final”
        String ticket = scanner.nextLine(); //“Standard”, “Premium” или “VIP”
        int quantity = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);

        double price = 0.0;

        switch (stage) {
            case "Quarter final":
                if (ticket.equals("Standard")) {
                    price = quantity * 55.50;
                } else if (ticket.equals("Premium")) {
                    price = 105.2 * quantity;
                } else if (ticket.equals("VIP")) {
                    price = 118.9 * quantity;
                }
                break;
            case "Semi final":
                if (ticket.equals("Standard")) {
                    price = quantity * 75.88;
                } else if (ticket.equals("Premium")) {
                    price = 125.22 * quantity;
                } else if (ticket.equals("VIP")) {
                    price = 300.40 * quantity;
                }
                break;

            case "Final":
                if (ticket.equals("Standard")) {
                    price = quantity * 110.10;
                } else if (ticket.equals("Premium")) {
                    price = 160.66 * quantity;
                } else if (ticket.equals("VIP")) {
                    price = 400 * quantity;
                }
                break;
        }

        switch (symbol) {
            case 'Y':
                if (price > 4000) {
                    price = price * 0.75;
                } else if (price > 2500 && price <= 4000) {
                    price = price * 0.9;
                    price = (price + quantity * 40);
                } else if (price < 2500 && price > 0) {
                    price = (price + (quantity * 40));
                }
                break;
            case 'N':
                if (price > 4000) {
                    price = price * 0.75;
                } else if (price > 2500 && price <= 4000) {
                    price = price * 0.9;
                } else if (price < 2500 && price > 0) {
                    price = price;
                }
                break;
        }
        System.out.printf("%.2f", price);
    }
}
