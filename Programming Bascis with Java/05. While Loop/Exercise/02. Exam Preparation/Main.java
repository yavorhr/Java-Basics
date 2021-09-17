import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowedPoorGradesCount = Integer.parseInt(scanner.nextLine());

        double averageGrades = 0;
        int counterPoorGrades = 0;
        int counter = 0;
        boolean mistakes = false;
        String lastProblem = "";

        String input = scanner.nextLine();
        while (!input.equals("Enough")) {
            String problemName = input;
            int grade = Integer.parseInt(scanner.nextLine());
            averageGrades += grade;
            counter++;
            lastProblem = problemName;

            if (grade <= 4) {
                counterPoorGrades++;
            }
            if (counterPoorGrades == allowedPoorGradesCount) {
                mistakes = true;
                break;
            }
            input = scanner.nextLine();
        }
        
        if (mistakes) {
            System.out.printf("You need a break, %d poor grades.", counterPoorGrades);
        } else {
            System.out.printf("Average score: %.2f%n", averageGrades / counter);
            System.out.printf("Number of problems: %d%n", counter);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
