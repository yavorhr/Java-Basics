import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"))) {
            switch (fruit) {
                case "banana":
                    price = 2.50 * quantity;
                    break;
                case "apple":
                    price = 1.20 * quantity;
                    break;
                case "orange":
                    price = 0.85 * quantity;
                    break;
                case "grapefruit":
                    price = 1.45 * quantity;
                    break;
                case "kiwi":
                    price = 2.70 * quantity;
                    break;
                case "pineapple":
                    price = 5.50 * quantity;
                    break;
                case "grapes":
                    price = 3.85 * quantity;
                    break;
                default:
                    System.out.println("error");
            }
        } else if ((day.equals("Saturday") || day.equals("Sunday"))) {
            switch (fruit) {
                case "banana":
                    price = 2.70 * quantity;
                    break;
                case "apple":
                    price = 1.25 * quantity;
                    break;
                case "orange":
                    price = 0.90 * quantity;
                    break;
                case "grapefruit":
                    price = 1.60 * quantity;
                    break;
                case "kiwi":
                    price = 3.00 * quantity;
                    break;
                case "pineapple":
                    price = 5.60 * quantity;
                    break;
                case "grapes":
                    price = 4.20 * quantity;
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

        if (price > 0) {
            System.out.printf("%.2f", price);
        }

    }
}
