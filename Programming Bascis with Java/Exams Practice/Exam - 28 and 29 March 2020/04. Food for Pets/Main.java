import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double startFood = Double.parseDouble(scanner.nextLine());

        double biscuit = 0.0;
        double allBiscuits = 0;
        int doggyTotal = 0;
        int catTotal = 0;
        int togetherTotal = 0;

        for (int i = 1; i <= days; i++) {
            int doggyFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                biscuit = biscuit + 1;
                biscuit = ((doggyFood + catFood) * 1.0) * 0.1;
                allBiscuits += biscuit;
            }

            doggyTotal += doggyFood;
            catTotal += catFood;
            togetherTotal += doggyFood + catFood;
        }

        double percentTogether = ((togetherTotal * 1.0) / startFood) * 100;
        double percentCat = ((catTotal * 1.0) / togetherTotal) * 100;
        double percentDoggy = ((doggyTotal * 1.0) / togetherTotal) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", allBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentTogether);
        System.out.printf("%.2f%% eaten from the dog.%n", percentDoggy);
        System.out.printf("%.2f%% eaten from the cat.", percentCat);

    }
}

