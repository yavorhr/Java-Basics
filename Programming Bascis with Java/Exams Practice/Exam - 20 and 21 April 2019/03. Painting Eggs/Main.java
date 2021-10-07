import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (color) {
            case "Red":
                if (size.equals("Large")) {
                    price = quantity * 16;
                } else if (size.equals("Medium")) {
                    price = quantity * 13;
                } else if (size.equals("Small")) {
                    price = quantity * 9;
                }
                break;
            case "Green":
                if (size.equals("Large")) {
                    price = quantity * 12;
                } else if (size.equals("Medium")) {
                    price = quantity * 9;
                } else if (size.equals("Small")) {
                    price = quantity * 8;
                }
                break;
            case "Yellow":
                if (size.equals("Large")) {
                    price = quantity * 9;
                } else if (size.equals("Medium")) {
                    price = quantity * 7;
                } else if (size.equals("Small")) {
                    price = quantity * 5;
                }
                break;
        }

        double netProfit = price - 0.35 * price;

        System.out.printf("%.2f leva.", netProfit);
    }
}


