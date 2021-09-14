import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 0;
        double allNotes = 0;

        double attempts = 0;
        while (grade < 12) {
            double note = Double.parseDouble(scanner.nextLine());

            if (note >= 4.00) {
                allNotes += note;
            } else if (note < 4.00) {
                attempts++;
            }
            if (attempts == 2) {
                System.out.printf("%s has been excluded at %d grade%n", name, grade);
                break;
            }
            grade++;
        }

        double averageNotes = allNotes / grade;
        if (attempts < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageNotes);
        }

    }
}

