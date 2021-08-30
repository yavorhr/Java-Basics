import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int confectioners = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakeSum = cakes * 45;
        double waffleSum = waffles * 5.80;
        double pancakeSum = pancakes * 3.20;

        double allDayProfit = (cakeSum + waffleSum + pancakeSum) * confectioners;
        double profitTotal = allDayProfit * days;

        double sumWithoutExpenses = profitTotal - profitTotal * 0.125;

        System.out.printf("%.2f", sumWithoutExpenses);
    }
}
