import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statue = 0.7 * rent;
        double catering = 0.85 * statue;
        double sound = 0.5 * catering;

        double allExpenses = rent + sound + statue + catering;

        System.out.printf("%.2f", allExpenses);

    }
}
