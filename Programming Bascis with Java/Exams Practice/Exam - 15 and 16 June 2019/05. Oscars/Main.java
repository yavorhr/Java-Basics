import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        double totalCurrentPoints = 0;

        for (int i = 0; i < judges; i++) {
            String currentJudge = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());

            int length = currentJudge.length();

            double points = (length * currentPoints) / 2;
            totalCurrentPoints = totalCurrentPoints + points;

            if (totalCurrentPoints + startPoints > 1250.5) {
                break;
            }

        }

        double diff = 1250.5 - totalCurrentPoints - startPoints;
        if (totalCurrentPoints + startPoints <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalCurrentPoints + startPoints);
        }

    }
}






