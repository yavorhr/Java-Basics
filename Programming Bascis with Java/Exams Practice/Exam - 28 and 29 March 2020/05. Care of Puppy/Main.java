import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int availableFood = Integer.parseInt(scanner.nextLine()) * 1000;

        String input = scanner.nextLine();
        while (!("Adopted".equals(input))) {
            int foodPerDay = Integer.parseInt(input);

            availableFood -= foodPerDay;


            input = scanner.nextLine();
        }

        if (availableFood >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", availableFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(availableFood));
        }

    }
}
