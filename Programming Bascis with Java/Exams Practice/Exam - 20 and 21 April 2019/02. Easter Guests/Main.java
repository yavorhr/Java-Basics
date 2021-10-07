import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBread = Math.ceil(guests / 3.00);
        double easterBreadTotal = easterBread * 4;
        int eggs = guests * 2;
        double eggsTotal = eggs * 0.45;
        double sum = easterBreadTotal + eggsTotal;

        if (budget >= sum) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", easterBread, eggs);
            System.out.printf("He has %.2f lv. left.", budget - sum);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", sum - budget);
        }

    }
}
