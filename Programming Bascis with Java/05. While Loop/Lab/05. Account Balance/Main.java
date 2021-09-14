import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        int counter = 0;

        while (n > counter) {
            double money = Double.parseDouble(scanner.nextLine());

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += money;
            System.out.printf("Increase: %.2f%n", money);

            counter++;
        }

        System.out.printf("Total: %.2f", sum);
    }
}

