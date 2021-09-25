import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int bees = Integer.parseInt(scanner.nextLine());
        int healthOfBear = Integer.parseInt(scanner.nextLine());
        int attackOfBear = Integer.parseInt(scanner.nextLine());

        while (bees >= 100) {
            bees = bees - attackOfBear;

            healthOfBear = healthOfBear - (bees * 5);

            if (healthOfBear <= 0) {
                break;
            }
        }

        if (bees < 0) {
            bees = 0;
        }
        if (bees >= 100) {
            System.out.printf("Beehive won! Bees left %d.", bees);
        } else {
            System.out.printf("The bear stole the honey! Bees left %d.", bees);
        }

    }
}
