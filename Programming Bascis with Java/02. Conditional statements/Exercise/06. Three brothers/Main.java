import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstBrother = Double.parseDouble(scanner.nextLine());
        double secondBrother = Double.parseDouble(scanner.nextLine());
        double thirdBrother = Double.parseDouble(scanner.nextLine());
        double fatherFishing = Double.parseDouble(scanner.nextLine());

        double timeTogether = 1 / (1 / firstBrother + 1 / secondBrother + 1 / thirdBrother);
        double rest = timeTogether * 0.15;
        double timePlusRest = timeTogether + rest;
        double timeLeft = fatherFishing - timeTogether;

        System.out.printf("Cleaning time: %.2f%n", timePlusRest);

        if (fatherFishing > timeTogether) {
            timeLeft = Math.floor(timeLeft);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", timeLeft);
        } else {
            double notEnough = Math.ceil(timeTogether - fatherFishing);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", notEnough);
        }

    }
}
