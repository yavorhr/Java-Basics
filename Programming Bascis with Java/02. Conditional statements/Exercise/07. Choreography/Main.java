import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double steps = Integer.parseInt(scanner.nextLine());
        double dancers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        double stepsPerDay = (steps / days) / steps;
        double stepsPerDayPercent = Math.ceil(stepsPerDay * 100);

        double stepsPerDancer = stepsPerDayPercent / dancers;

        if (stepsPerDayPercent <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", stepsPerDancer);
        } else {
            System.out.printf("No, they will not succeed in that goal! Required %.2f%% steps to be learned per day.", stepsPerDancer);
        }

    }
}
