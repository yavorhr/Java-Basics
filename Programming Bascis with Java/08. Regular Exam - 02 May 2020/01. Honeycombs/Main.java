import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int bees = Integer.parseInt(scanner.nextLine());
            int flowers = Integer.parseInt(scanner.nextLine());

            double honey = bees * flowers * 0.21;

            double honeycomb = Math.floor(honey / 100);
            double restHoney = honey % 100;

            System.out.printf("%.0f honeycombs filled.%n", honeycomb);
            System.out.printf("%.2f grams of honey left.%n", restHoney);
        }
    }



