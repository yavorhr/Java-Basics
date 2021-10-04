import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        while (!("ACTION".equals(input))) {
            String currentName = input;
            int length = currentName.length();
            if (length > 15) {
                budget -= budget * 0.2;
            }
            if (length <= 15) {
                double salary = Double.parseDouble(scanner.nextLine());
                budget = budget - salary;
            }
            if (budget < 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }

    }
}





