import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean one = true;
        boolean two = true;

        int eggsPlayerOne = Integer.parseInt(scanner.nextLine());
        int eggsPlayerTwo = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!("End of battle".equals(input))) {

            if ("one".equals(input)) {
                eggsPlayerTwo--;
            } else {
                eggsPlayerOne--;
            }

            if (eggsPlayerOne <= 0) {
                one = false;
                break;
            }
            if (eggsPlayerTwo <= 0) {
                two = false;
                break;
            }

            input = scanner.nextLine();
        }

        if ("End of battle".equals(input)) {
            System.out.printf("Player one has %d eggs left.%n", eggsPlayerOne);
            System.out.printf("Player two has %d eggs left.%n", eggsPlayerTwo);
        }

        if (!one) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsPlayerTwo);
        } else if (!two) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsPlayerOne);
        }

    }
}

