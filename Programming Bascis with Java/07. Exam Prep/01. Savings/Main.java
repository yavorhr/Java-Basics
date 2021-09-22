import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());

        double unexpectedExpenses = (0.3 * monthlyIncome);
        double expensesForMonth = unexpectedExpenses + expenses;

        double netSavings = monthlyIncome - expensesForMonth;
        double percent = (netSavings / monthlyIncome) * 100;
        double allMoney = netSavings * months;

        System.out.printf("She can save %.2f%%%n", percent);
        System.out.printf("%.2f", allMoney);
    }
}

