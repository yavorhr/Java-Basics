import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allEggs = Integer.parseInt(scanner.nextLine());
        int soldEggs = 0;
        int deliveredEggs = 0;
        int remainEggs = 0;

        String input = scanner.nextLine();
        while (!("Close".equals(input))) {
            String action = input;
            int currentEggs = Integer.parseInt(scanner.nextLine());

            if ("Buy".equals(action)) {
                if (currentEggs > allEggs) {
                    remainEggs = allEggs;
                    break;
                } else {
                    soldEggs += currentEggs;
                    allEggs -= currentEggs;
                }

            }
            if ("Fill".equals(action)) {
                deliveredEggs += currentEggs;
                allEggs += currentEggs;
            }

            input = scanner.nextLine();
        }

        if ("Close".equals(input)) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", remainEggs);
        }

    }
}

