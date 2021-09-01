import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rate = scanner.nextLine();

        double discount = 0;
        double price = 0;

        int nights = days - 1;

        if (nights < 10) {
            switch (roomType) {
                case "room for one person":
                    discount = 0;
                    price = nights * 18;
                    break;
                case "apartment":
                    discount = 0.3 * (nights * 25);
                    price = (nights * 25) - discount;
                    break;
                case "president apartment":
                    discount = 0.1 * (nights * 35);
                    price = (nights * 35) - discount;
                    break;
            }
        } else if (nights > 10 && nights < 15) {
            switch (roomType) {
                case "room for one person":
                    discount = 0;
                    price = nights * 18;
                    break;
                case "apartment":
                    discount = 0.35 * (nights * 25);
                    price = (nights * 25) - discount;
                    break;
                case "president apartment":
                    discount = 0.15 * (nights * 35);
                    price = (nights * 35) - discount;
                    break;
            }
        } else if (nights > 15) {
            switch (roomType) {
                case "room for one person":
                    discount = 0;
                    price = nights * 18;
                    break;
                case "apartment":
                    discount = 0.50 * (nights * 25);
                    price = (nights * 25) - discount;
                    break;
                case "president apartment":
                    discount = 0.20 * (nights * 35);
                    price = (nights * 35) - discount;
                    break;
            }
        }

        if (rate.equals("positive")) {
            price = (price * 0.25) + price;
        } else {
            price = price - (price * 0.1);
        }

        System.out.printf("%.2f", price);
    }
}

