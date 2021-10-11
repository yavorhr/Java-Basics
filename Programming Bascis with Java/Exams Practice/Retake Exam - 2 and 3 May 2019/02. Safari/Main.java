import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double liters = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double gasMoney = liters * 2.10;
        double totalMoneyNeeded = 100 + gasMoney;

        if (day.equals("Sunday")) {
            totalMoneyNeeded *= 0.8;
        } else if (day.equals("Saturday")) {
            totalMoneyNeeded *= 0.9;
        }

        double diff = Math.abs(totalMoneyNeeded - budget);

        if (budget >= totalMoneyNeeded) {
            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }


    }
}

