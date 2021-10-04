import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        String extras = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (projection) {
            case "John Wick":
                if (extras.equals("Drink")) {
                    price = tickets * 12;
                } else if (extras.equals("Popcorn")) {
                    price = tickets * 15;
                } else if (extras.equals("Menu")) {
                    price = tickets * 19;
                }
                break;
            case "Star Wars":
                if (extras.equals("Drink")) {
                    price = tickets * 18;
                } else if (extras.equals("Popcorn")) {
                    price = tickets * 25;
                } else if (extras.equals("Menu")) {
                    price = tickets * 30;
                }
                if (tickets >= 4) {
                    price = price * 0.7;
                }
                break;
            case "Jumanji":

                if (extras.equals("Drink")) {
                    price = tickets * 9;
                } else if (extras.equals("Popcorn")) {
                    price = tickets * 11;
                } else if (extras.equals("Menu")) {
                    price = tickets * 14;
                }
                if (tickets == 2) {
                    price = price * 0.85;
                }
                break;
        }

        System.out.printf("Your bill is %.2f leva.", price);
    }
}


