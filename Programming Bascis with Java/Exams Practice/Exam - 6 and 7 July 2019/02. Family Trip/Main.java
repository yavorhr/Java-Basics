import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        double percent = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            nightPrice = nightPrice * 0.95;
        }
        double stay = nights * nightPrice;
        double additionalExpenses = (percent / 100) * budget;
        double allExpeses = stay + additionalExpenses;

        if (budget >= allExpeses) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - allExpeses);
        } else {
            System.out.printf("%.2f leva needed.", allExpeses - budget);
        }

    }
}

