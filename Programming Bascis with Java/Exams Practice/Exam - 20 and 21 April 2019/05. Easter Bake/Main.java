import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunaci = Integer.parseInt(scanner.nextLine());

        double allSugar = 0;
        double allFlour = 0;

        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 0; i < kozunaci; i++) {
            int currentSugar = Integer.parseInt(scanner.nextLine());
            int currentFlour = Integer.parseInt(scanner.nextLine());

            if (currentSugar > maxSugar) {
                maxSugar = currentSugar;
            }

            if (currentFlour > maxFlour) {
                maxFlour = currentFlour;
            }

            allSugar += currentSugar;
            allFlour += currentFlour;
        }

        double sugarPackages = Math.ceil(allSugar / 950);
        double flourPackages = Math.ceil(allFlour / 750);

        System.out.printf("Sugar: %.0f%n", sugarPackages);
        System.out.printf("Flour: %.0f%n", flourPackages);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);

    }
}

