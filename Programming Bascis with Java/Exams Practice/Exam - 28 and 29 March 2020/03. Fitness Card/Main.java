import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0.0;

        switch (sport) {
            case "Gym":
                if (gender == 'm') {
                    price = 42;
                } else if (gender == 'f') {
                    price = 35;
                }
                break;
            case "Pilates":
                if (gender == 'm') {
                    price = 39;
                } else if (gender == 'f') {
                    price = 37;
                }
                break;
            case "Boxing":
                if (gender == 'm') {
                    price = 41;
                } else if (gender == 'f') {
                    price = 37;
                }
                break;
            case "Yoga":
                if (gender == 'm') {
                    price = 45;
                } else if (gender == 'f') {
                    price = 42;
                }
                break;
            case "Zumba":
                if (gender == 'm') {
                    price = 34;
                } else if (gender == 'f') {
                    price = 31;
                }
                break;
            case "Dances":
                if (gender == 'm') {
                    price = 51;
                } else if (gender == 'f') {
                    price = 53;
                }
                break;
        }
        if (age <= 19) {
            price = price * 0.8;
        }

        if (budget >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - budget);
        }

    }
}

