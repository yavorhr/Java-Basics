import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!("End".equals(destination))) {
            double target = Double.parseDouble(scanner.nextLine());
            while (target >= 0) {
                double currentBudget = Double.parseDouble(scanner.nextLine());
                target -= currentBudget;

                if (target <= 0) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
            }
            destination = scanner.nextLine();
        }

    }
}

