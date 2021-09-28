import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());


        double decor = budget * 0.1;
        double moneyForClothes = statists * clothes;

        if (statists > 150) {
            moneyForClothes = moneyForClothes * 0.9;
        }

        double allExpenses = decor + moneyForClothes;

        if (budget >= allExpenses) {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - allExpenses);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", allExpenses - budget);
        }

    }
}
