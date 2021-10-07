import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunaci = Integer.parseInt(scanner.nextLine());
        int maxPoints = Integer.MIN_VALUE;
        String winner = "";

        for (int i = 0; i < kozunaci; i++) {
            String baker = scanner.nextLine();

            int allBakerPoints = 0;

            String input = scanner.nextLine();
            while (!("Stop".equals(input))) {
                int points = Integer.parseInt(input);
                allBakerPoints += points;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", baker, allBakerPoints);

            if (allBakerPoints > maxPoints) {
                maxPoints = allBakerPoints;
                System.out.printf("%s is the new number 1!%n", baker);
                winner = baker;
            }
        }

        System.out.printf("%s won competition with %d points!%n", winner, maxPoints);
    }
}
