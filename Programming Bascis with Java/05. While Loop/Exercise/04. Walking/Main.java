import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;

        while (totalSteps < 10000) {
            String input = scanner.nextLine();
            if ("Going home".equals(input)) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                totalSteps += stepsToHome;
                break;
            }
            int currentSteps = Integer.parseInt(input);
            totalSteps += currentSteps;
        }

        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            int diff = 10000 - totalSteps;
            System.out.printf("%d more steps to reach goal.", diff);
        }

    }
}

