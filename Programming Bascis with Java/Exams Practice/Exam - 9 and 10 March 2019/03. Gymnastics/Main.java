import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String discipline = scanner.nextLine();

        double score = 0.0;

        switch (country) {
            case "Russia":
                if (discipline.equals("ribbon")) {
                    score = 9.1 + 9.4;
                } else if (discipline.equals("hoop")) {
                    score = 9.3 + 9.8;
                } else if (discipline.equals("rope")) {
                    score = 9.6 + 9;
                }
                break;
            case "Bulgaria":
                if (discipline.equals("ribbon")) {
                    score = 9.6 + 9.4;
                } else if (discipline.equals("hoop")) {
                    score = 9.55 + 9.75;
                } else if (discipline.equals("rope")) {
                    score = 9.5 + 9.4;
                }
                break;
            case "Italy":
                if (discipline.equals("ribbon")) {
                    score = 9.2 + 9.5;
                } else if (discipline.equals("hoop")) {
                    score = 9.45 + 9.35;
                } else if (discipline.equals("rope")) {
                    score = 9.7 + 9.15;
                }
                break;
        }

        double diff = 20 - score;
        double percent = (diff / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, score, discipline);

        if (diff > 0) {
            System.out.printf("%.2f%%", percent);
        }

    }
}

