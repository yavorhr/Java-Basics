import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 1;
        double allNotes = 0;

        while (grade <= 12) {
            double note = Double.parseDouble(scanner.nextLine());

            if (note >= 4.00) {
                grade++;
                allNotes += note;
            }
        }

        double averageNotes = allNotes / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, averageNotes);
    }
}
