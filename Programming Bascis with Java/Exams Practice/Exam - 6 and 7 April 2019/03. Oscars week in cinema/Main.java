import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine(); //("A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite")
        String hall = scanner.nextLine(); //("normal", "luxury" или "ultra luxury")
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (movie) {
            case "A Star Is Born":
                if (hall.equals("normal")) {
                    price = 7.50 * tickets;
                } else if (hall.equals("luxury")) {
                    price = 10.50 * tickets;
                } else if (hall.equals("ultra luxury")) {
                    price = tickets * 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (hall.equals("normal")) {
                    price = 7.35 * tickets;
                } else if (hall.equals("luxury")) {
                    price = 9.45 * tickets;
                } else if (hall.equals("ultra luxury")) {
                    price = tickets * 12.75;
                }
                break;
            case "Green Book":
                if (hall.equals("normal")) {
                    price = 8.15 * tickets;
                } else if (hall.equals("luxury")) {
                    price = 10.25 * tickets;
                } else if (hall.equals("ultra luxury")) {
                    price = tickets * 13.25;
                }
                break;
            case "The Favourite":
                if (hall.equals("normal")) {
                    price = 8.75 * tickets;
                } else if (hall.equals("luxury")) {
                    price = 11.55 * tickets;
                } else if (hall.equals("ultra luxury")) {
                    price = tickets * 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movie, price);

    }
}
