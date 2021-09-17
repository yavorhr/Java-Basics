import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int cakes = length * width; // 10 * 10

        while (cakes > 0) {
            String input = scanner.nextLine();
            if ("STOP".equals(input)) {
                System.out.printf("%d pieces are left.", cakes);
                break;
            }
            int currentCake = Integer.parseInt(input);
            cakes -= currentCake;
        }

        if (cakes < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakes));
        }

    }
}

