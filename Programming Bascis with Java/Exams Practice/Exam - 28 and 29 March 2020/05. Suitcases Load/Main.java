import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        int n = 0;
        int casesCount = 0;

        String input = scanner.nextLine();
        while (!("End".equals(input))) {
            double suitCase = Double.parseDouble(input);
            n++;

            if (n % 3 == 0) {
                capacity = capacity - (suitCase + (suitCase * 0.1));
            } else {
                capacity -= suitCase;
            }

            if (capacity <= 0) {
                break;
            }

            casesCount++;
            input = scanner.nextLine();
        }

        if ("End".equals(input)) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        if (capacity <= 0) {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", casesCount);
    }
}
