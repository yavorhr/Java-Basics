import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double avGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0.0;
        double excellentScholarship = 0.0;

        if (income < minSalary && avGrade > 4.50) {
            socialScholarship = minSalary * 0.35;
        }

        if (avGrade >= 5.50) {
            excellentScholarship = avGrade * 25;
        }

        if (socialScholarship == 0 && excellentScholarship == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (excellentScholarship >= socialScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarship));
        } else {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
        }

    }
}