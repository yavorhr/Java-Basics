import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double towelPrice = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double umbrellaPrice = (towelPrice / 3) * 2;
        double flipFlopsPrice = 0.75 * umbrellaPrice;
        double bagPrice = (flipFlopsPrice + towelPrice) / 3;

        double allItems = towelPrice + umbrellaPrice + flipFlopsPrice + bagPrice;
        double doubleDiscount = discount * 1.0 / 100;
        double allItemsMinusDiscount = allItems - (allItems * doubleDiscount);

        if (budget >= allItemsMinusDiscount) {
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", allItemsMinusDiscount, budget - allItemsMinusDiscount);
        } else {
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", allItemsMinusDiscount, allItemsMinusDiscount - budget);
        }

    }
}

