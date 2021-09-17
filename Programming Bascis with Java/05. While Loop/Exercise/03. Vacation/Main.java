import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double startMoney = Double.parseDouble(scanner.nextLine());

        int spendingDays = 0;
        int days = 0;

        while (startMoney < neededMoney) {
            String action = scanner.nextLine(); // save or spend
            double currentMoney = Double.parseDouble(scanner.nextLine());

            if (action.equals("save")) {
                startMoney += currentMoney;
                spendingDays = 0;
            } else if (action.equals("spend")) {
                startMoney -= currentMoney;
                spendingDays++;
            }
            if (startMoney < 0) {
                startMoney = 0;
            }
            days++;

            if (spendingDays == 5) {
                break;
            }
        }

        if (spendingDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }

    }
}
