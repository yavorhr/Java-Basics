import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countParticipants = Integer.parseInt(scanner.nextLine()); //3

        double sum = 0;
        int allSweets = 0;

        for (int i = 0; i < countParticipants; i++) {
            String name = scanner.nextLine();
            String input = scanner.nextLine(); //cookies

            int countCookies = 0;
            int countCakes = 0;
            int countWaffles = 0;

            while (!input.equals("Stop baking!")) {
                int countSweets = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case "cookies":
                        sum = sum + (countSweets * 1.50);
                        countCookies += countSweets;
                        break;
                    case "cakes":
                        countCakes += countSweets;
                        sum = sum + (countSweets * 7.80);
                        break;
                    case "waffles":
                        countWaffles += countSweets;
                        sum = sum + (countSweets * 2.30);
                        break;
                }
                allSweets += countSweets;
                input = scanner.nextLine();
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", name, countCookies, countCakes, countWaffles);
        }

        System.out.printf("All bakery sold: %d%n", allSweets);
        System.out.printf("Total sum for charity: %.2f lv.%n", sum);

    }
}
