import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int evenMoney = 0;
        int counter = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                evenMoney += 10;
                sum = sum + evenMoney;
                counter = counter + 1;
            } else {
                sum = sum + toyPrice;
            }
        }

        double savedMoney = sum - counter;

        if (savedMoney >= priceWashMachine) {
            System.out.printf("Yes! %.2f", savedMoney - priceWashMachine);
        } else {
            System.out.printf("No! %.2f", priceWashMachine - savedMoney);
        }

    }
}

