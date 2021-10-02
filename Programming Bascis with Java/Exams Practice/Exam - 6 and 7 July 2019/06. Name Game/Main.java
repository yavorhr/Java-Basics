import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int points = 0;
        int maxPoints = Integer.MIN_VALUE;
        String winner = " ";

        while (!name.equals("Stop")) {
            for (int i = 0; i <= name.length() - 1; i++) {
                char symbol = name.charAt(i);
                int number = Integer.parseInt(scanner.nextLine());

                if (number == symbol) {
                    points += 10;
                } else {
                    points += 2;
                }
            }
            if (points >= maxPoints) {
                maxPoints = points;
                winner = name;
                points = 0;
            }

            name = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}