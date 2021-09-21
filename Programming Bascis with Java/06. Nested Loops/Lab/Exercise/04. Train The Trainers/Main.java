import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        double totalScore = 0.0;
        int count = 0;

        String input = scanner.nextLine();
        while (!("Finish".equals(input))) {

            double currentPresentationScore = 0.0;
            for (int i = 0; i < jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                currentPresentationScore = currentPresentationScore + grade;
            }

            double averagePresentationScore = currentPresentationScore / jury;
            System.out.printf("%s - %.2f.%n", input, averagePresentationScore);
            totalScore = totalScore + averagePresentationScore;
            count++;

            input = scanner.nextLine();
        }

        double finalScore = totalScore / count;
        System.out.printf("Student's final assessment is %.2f.", finalScore);
    }
}
